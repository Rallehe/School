using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal static class ProductGroup
    {
        //Tar in produktgrupp och returnerar id som matchar den i Nilex, om produktgruppen inte finns så släger den ett fel så man kan lägga till den.
        //Detta så ingen enhet kommer komma in utan produktgrupp.
        public static int GetProductGroupIdFromName(string productGroup)
        {
            switch(productGroup)
            {
                case "Laptops":
                case "Laptops, Apple":
                case "Laptops, 2-in-1":
                    return 5;
                case "Laptops, Chromebooks":
                    return 62;
                case "Copier":
                    return 25;
                case "Printers":
                    return 24;
                case "Desktops":
                case "Desktops, Workstations":
                    return 4;
                case "Services":
                    return 1;
                case "Software":
                    return 1;
                case "Laptop accessories":
                    return 1;
                case "Tablets, Apple":
                    return 9;
                case "Monitors TFT/LCD":
                    return 23;
                default:
                    throw new FormatException("Invalid productgroup: " + productGroup);
            }
        }
    }
}
