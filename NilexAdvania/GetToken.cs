using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class GetToken
    {

        public static string advaniaToken { get; set; }


        public static string nilexToken { get; set; }

        public static async Task GetNilexToken()
        {


            string apiUrl = Secrets.NilexApiUrl;
            using (HttpClient client = new HttpClient())
            {                                                                           
                HttpResponseMessage response = await client.GetAsync(Secrets.NilexApiUrl + "logon/getauthenticationtoken?email=" + Secrets.NilexEmail + "&password=" + Secrets.NilexPassword);
                string strResp = await response.Content.ReadAsStringAsync();
                dynamic parsedJson = JObject.Parse(strResp);

                client.DefaultRequestHeaders.Accept.Clear();
                client.DefaultRequestHeaders.Accept.Add(new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));
                if (!response.IsSuccessStatusCode)
                {
                    throw new HttpRequestException("Nilex: " + (int)response.StatusCode + " " + response.StatusCode);
                }
                nilexToken = parsedJson.Result.Token;

            }
        }
        public static async Task GetAdvaniaToken(Kommun kommun)
        {
            switch (kommun)
            {
                case Kommun.VARGARDA:
                    Secrets.AdvaniaUsername = Secrets.AdvaniaVargardaUsername;
                    Secrets.AdvaniaPassword = Secrets.AdvaniaVargardaPassword;
                    Secrets.AdvaniaApiKey = Secrets.AdvaniaVargardaApiKey;
                    break;
                case Kommun.HERRLJUNGA:
                    Secrets.AdvaniaUsername = Secrets.AdvaniaHerrljungaUsername;
                    Secrets.AdvaniaPassword = Secrets.AdvaniaHerrljungaPassword;
                    Secrets.AdvaniaApiKey = Secrets.AdvaniaHerrljungaApiKey;
                    break;
                default:
                    throw new FormatException();
            }
            // Create an instance of HttpClient
            using HttpClient client = new HttpClient();

            string base64Auth = Convert.ToBase64String(Encoding.GetEncoding("ISO-8859-1").GetBytes($"{Secrets.AdvaniaUsername}:{Secrets.AdvaniaPassword}"));

            // Add basic auth with encoded username and password
            client.DefaultRequestHeaders.Authorization = new System.Net.Http.Headers.AuthenticationHeaderValue("Basic", base64Auth);

            // Add x-api-key & content type
            client.DefaultRequestHeaders.Add("x-api-key", Secrets.AdvaniaApiKey);

            // We ignore the content type header
            // client.DefaultRequestHeaders.Accept.Add(new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/x-www-form-urlencoded"));

            // Send a POST request to the API to retrieve the token
            HttpResponseMessage response = await client.PostAsync(Secrets.AdvaniaApiUrl + "token", null);

            // Check the response status code and handle the response as needed

            string strResp = await response.Content.ReadAsStringAsync();
            dynamic parsedJson = JObject.Parse(strResp);
            if (!response.IsSuccessStatusCode)
            {
                throw new HttpRequestException("Advania: " + (int)response.StatusCode + " " + response.StatusCode);
            }
            advaniaToken = parsedJson.access_token;
        }

    }
}
