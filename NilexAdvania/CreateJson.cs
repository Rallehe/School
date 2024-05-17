using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{

    //Denna klassen hanterar skapandet av Jsonobjekt med två metoder som retunerar en lista av entities(en override)
    internal class CreateJson
    {
        public static List<Entity> CreateEntityListOfJsonObjects(string json, string path, string element)
        {
            dynamic jsonData = JObject.Parse(json);
            List<Entity> entityList = new();

            foreach (JObject item in jsonData.SelectToken(path))
            {
                //Gör om objektet till en sträng
                string jsonObject = item.ToString();
                //Gör om stängen till dynamic så vi kan plocka ut serienummer
                dynamic jsonObjectDynamic = JObject.Parse(jsonObject);
                //Plockar ut serienumret
                string serialNumberString = jsonObjectDynamic.SelectToken(element);
                
                //Lägger in serienumret i en lista av entity, vi kör uppercase för att undvika dubletter
                entityList.Add(new Entity(serialNumberString));

            }
            return entityList;
        }


        //Innehåller samtliga fält som vi hämtar från advania och sätter in i en enhet(entity)
        public static List<Entity> CreateAdvaniaEntityListOfJsonObjects(string json)
        {
            dynamic jsonData = JObject.Parse(json);
            List<Entity> entityList = new();

            foreach (JObject item in jsonData.devices)
            {
                string jsonObject = item.ToString();
                dynamic parsedJson = JObject.Parse(jsonObject);
                string name = parsedJson.name;
                string serialNumber = parsedJson.serialnumber;
                string costCenter = parsedJson.costcenter;
                string costCenter2 = parsedJson.costcenter2;
                string contractNumber = parsedJson.contractnumber;
                string ageAtContractEnd = parsedJson.ageatcontractend;
                string contractStart = parsedJson.startdate;
                string contractEnd = parsedJson.enddate;
                string purchasePrice = parsedJson.purchaseprice;
                string financialType = parsedJson.financialtype;
                string invoiceNumber = parsedJson.invoicenumber;
                string location = parsedJson.location;
                string pickupAdress = parsedJson.pickuplocationall;
                

                string productGroup = parsedJson.productgroup;
                int productGroupId = ProductGroup.GetProductGroupIdFromName(productGroup);
                string company = parsedJson.company;
                int organizationID = CompanyName.GetCompanyIdFromName(company);
                
                entityList.Add(new Entity(name, serialNumber, organizationID, productGroupId, costCenter, costCenter2, contractNumber, contractEnd, contractStart, ageAtContractEnd, purchasePrice, financialType, location, pickupAdress));
            }
            return entityList;
        }
    }
}
