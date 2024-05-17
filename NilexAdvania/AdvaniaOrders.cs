using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class AdvaniaOrders
    {
        //Öppnar en klient där vi skickar en request till Advania api som tar hand om svaret och lägger in i lista av entity

        public static async Task<List<Entity>> GetAdvaniaEntities()
        {
            //Öppnar en klient
            using HttpClient client = new();


            HttpRequestMessage hrm = new(HttpMethod.Get, Secrets.AdvaniaApiUrl + "devices");
            hrm.Headers.Authorization = new AuthenticationHeaderValue("Bearer", GetToken.advaniaToken);
            hrm.Headers.Add("x-api-key", Secrets.AdvaniaApiKey);

            HttpResponseMessage response = await client.SendAsync(hrm);
           
            string responseContent = await response.Content.ReadAsStringAsync();

            if (!response.IsSuccessStatusCode)
            {
                throw new HttpRequestException("Advania: " + (int)response.StatusCode + " " + response.StatusCode);
            }
            Console.WriteLine("Advania: " + response.StatusCode);
            //Retunerar ett nyskapat Jsonobjekt
            return CreateJson.CreateAdvaniaEntityListOfJsonObjects(responseContent);
        }
    }

}
