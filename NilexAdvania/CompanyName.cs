using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal static class CompanyName
    {
        public static int GetCompanyIdFromName(string companyName)
        {
            switch (companyName)
            {
                case "Vårgårda kommun / C":
                    return 87;
                case "Herrljunga kommun / C":
                    return 17;
                default:
                    return 0;
            }
        }
    }
}
