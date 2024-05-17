using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class SendOrderToNilex
    {
        public static void SendOrders(List<Entity> remainingOrder)
        {
            int i = 0;
            foreach (var entity in remainingOrder)
            {
                i++;
                if (i == 50)
                {
                    return;
                }
                SendOrder(entity).GetAwaiter().GetResult();
               
            }
        }
        public static async Task SendOrder(Entity remainingOrder)
        {
            //Procurement type, 2 (Hårdkodad till "leasad")
            //VendorId = 1, (Hårdkodad till "Advania")
            var dynamicProperties = new Dictionary<string, object>
            {
                {"Avtal", remainingOrder.ContractNumber },
                {"XX/YY-nummer", remainingOrder.CostCenter },
                {"Kostnadsställe", remainingOrder.CostCenter2 },
                {"Leasing Startdatum", remainingOrder.ContractStart },
                {"Leasing Slutdatum", remainingOrder.ContractEnd },
                {"Warranty Start", remainingOrder.ContractStart },
                {"Warranty Period (months)", remainingOrder.AgeAtContractEnd },
                {"Purchase price", remainingOrder.PurchasePrice },
                {"Procurement type", 2 },
                {"Invoice number", remainingOrder.InvoiceNumber },
                {"Purchase date", remainingOrder.ContractStart },
                {"Placering", remainingOrder.Location },
                {"Leveransadress", remainingOrder.PickupAdress },

            };

            var requestBody = new
            {
                EntityType = "Ci",
                EntityTypeId = remainingOrder.EntityTypeID,
                ReferenceNo = remainingOrder.SerialNumber,
                ExternalReference = remainingOrder.SerialNumber,
                Name = remainingOrder.SerialNumber,
                OrganizationId = remainingOrder.OrganizationId,
                SerialNumber = remainingOrder.SerialNumber,
                VendorId = 1,
                CiStateId = 1,
                DynamicProperties = dynamicProperties,
            };

            using HttpClient client = new();

            string jsonBody = JsonConvert.SerializeObject(requestBody);

            Console.WriteLine(jsonBody);


            HttpRequestMessage hrm = new HttpRequestMessage(HttpMethod.Post, Secrets.NilexApiUrl + "publicapi/saveentity");
            hrm.Headers.Authorization = new AuthenticationHeaderValue("Bearer", GetToken.nilexToken);
            hrm.Content = new StringContent(jsonBody, System.Text.Encoding.UTF8, "application/json");

            HttpResponseMessage response = await client.SendAsync(hrm);
            string responseContent = await response.Content.ReadAsStringAsync();
            if (!response.IsSuccessStatusCode)
            {
                throw new HttpRequestException("Nilex: " + (int)response.StatusCode + " " + response.StatusCode);
            }

            Console.WriteLine(responseContent);
        }
    }
}
