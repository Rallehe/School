using ConsoleApp1;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;


class Program
{
    public static void Main(string[] args)
    {

        try
        {
            //Hämtar och sparar datan från Advania och Nilex
            List<Entity> ordersAdvania = Utils.FetchAllFromAdvania();
            List<Entity> ordersNilex = Utils.FetchAllFromNilex();

            //Filtrerar fram och sparar dom nya ordrarna (om det finns)
            var remainingOrders = ordersAdvania.Where(x => !ordersNilex.Any(y => y.SerialNumber == x.SerialNumber));

            //Sparar dom i en lista för att kunna skicka vidare i programmet
            List<Entity> realRemainingOrders = remainingOrders.ToList();
            Console.WriteLine("Det finns: " + realRemainingOrders.Count + " nya ordrar");

            //Skickar in nya ordrar i Nilex
            SendOrderToNilex.SendOrder(realRemainingOrders[0]).GetAwaiter().GetResult();
            //SendOrderToNilex.SendOrders(realRemainingOrders);
        }
        catch (Exception ex)
        {
            Utils.ErrorHandler(ex);
        }
    }
}
