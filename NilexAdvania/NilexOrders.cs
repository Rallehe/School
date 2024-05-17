using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class NilexOrders
    {
        //Hämtar alla Nilex ordrar 500 åt gången då dom har en maxgräns på runt 2000 entities per get
        //(endast serienummer) för att inte hämta onödig data
        public static async Task<List<Entity>> GetNilexEntities()
        {
            List<Entity> entityList = new();
            List<Entity> tempList;
            int page = 1;
            do
            {
                tempList = await GetNilexEntityPage(page);
                entityList.AddRange(tempList);
                page++;
            } while (tempList.Count == 500);

            return entityList;
        }

        //Öppnar en klient där vi skickar en request till Nilex api som tar hand om svaret och lägger in i lista av entity
        private static async Task<List<Entity>> GetNilexEntityPage(int page)
        {
            //Öppnar en klient
            using HttpClient client = new();

            client.DefaultRequestHeaders.Accept.Clear();
            client.DefaultRequestHeaders.Accept.Add(new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));

            //Skapar en body som specar hur många entities vi vill ha
            var requestBody = new
            {
                entityType = "Ci",
                pageSize = 500,
                page = page,
                columns = new[]
                {
                    "SerialNumber"
                }
            };

            //Skickar in body
            string jsonBody = JsonConvert.SerializeObject(requestBody);
            HttpRequestMessage hrm = new(HttpMethod.Post, Secrets.NilexApiUrl + "publicapi/getentitylistbyquery");
            hrm.Headers.Authorization = new AuthenticationHeaderValue("Bearer", GetToken.nilexToken);
            hrm.Content = new StringContent(jsonBody, System.Text.Encoding.UTF8, "application/json");

            //Hanterar svaret och skickar felmeddelande om svaret inte är 200
            HttpResponseMessage response = await client.SendAsync(hrm);
            if (!response.IsSuccessStatusCode)
            {
                throw new HttpRequestException("Nilex: " + (int)response.StatusCode + " " + response.StatusCode);
            }
            string responseContent = await response.Content.ReadAsStringAsync();

            Console.WriteLine("Nilex: " + response.StatusCode);
            //Retunerar ett nyskapat Jsonobjekt
            return CreateJson.CreateEntityListOfJsonObjects(responseContent, "Data", "SerialNumber");

        }
    }
}
