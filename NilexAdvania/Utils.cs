using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Mail;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    
    internal class Utils
    {
        //Hanterar hämtning av tokens och data
        public static void InitializeAdvaniaTokens(Kommun kommun)
        {
            GetToken.GetAdvaniaToken(kommun).GetAwaiter().GetResult();
        }
        public static void InitializeNilexToken()
        {
            GetToken.GetNilexToken().GetAwaiter().GetResult();
        }
        //Hämtar och retunerar listor med data från Advania och Nilex
        public static List<Entity> FetchAllFromAdvania()
        {
            Console.WriteLine("Hämtar data från Advania(Vårgårda)");
            InitializeAdvaniaTokens(Kommun.VARGARDA);
            List<Entity> ordersAdvania = AdvaniaOrders.GetAdvaniaEntities().GetAwaiter().GetResult();

            Console.WriteLine("Hämtar data från Advania(Herrljunga)");
            InitializeAdvaniaTokens(Kommun.HERRLJUNGA);
            ordersAdvania.AddRange(AdvaniaOrders.GetAdvaniaEntities().GetAwaiter().GetResult());

            return ordersAdvania;
        }
        public static List<Entity> FetchAllFromNilex()
        {
            Console.WriteLine("Hämtar data från Nilex");
            InitializeNilexToken();
            List<Entity> orderNilex = NilexOrders.GetNilexEntities().GetAwaiter().GetResult();
            return orderNilex;
        }

        //Skapar en errorlog map under "NilexAdvania\bin\Debug\net6.0" om det inte redan finns,
        //sparar sedan en fil med dagen datum som namn och felmeddelande som innehåll.
        public static void LogError(Exception ex)
        {
            string logDirectory = "errorlog";
            string logFileName = $"errorlog_{DateTime.Now:yyyyMMdd}.txt"; // Log file with the current date
            string logMessage = $"{DateTime.Now:yyyy-MM-dd HH:mm:ss} - {ex.Message}\n{ex.StackTrace}";

            try
            {
                if (!Directory.Exists(logDirectory))
                {
                    Directory.CreateDirectory(logDirectory);
                }

                string logFilePath = Path.Combine(logDirectory, logFileName);
                File.AppendAllText(logFilePath, logMessage + Environment.NewLine);
            }
            catch (IOException e)
            {
                Console.WriteLine("Error writing to the log file: " + e.Message);
            }
        }

        //Skickar mejl när något går fel. Kopplar upp på Herrljungas Smtp server, Ssl måste vara false då
        //server inte har support för secure connections.
        //Kan hända att man behöver username och password för att köra med Ssl, lägger ni till det
        //så byt till port 587.
        public static void SendErrorEmail(Exception ex)
        {
            string smtpServer = "";
            int smtpPort = 2;
            string smtpUsername = "";
            string smtpPassword = "";
            string senderEmail = "";
            string recipientEmail = "";

            using (SmtpClient client = new SmtpClient(smtpServer, smtpPort))
            {
                client.Credentials = new NetworkCredential(smtpUsername, smtpPassword);
                client.EnableSsl = false;

                MailMessage mailMessage = new MailMessage(senderEmail, recipientEmail)
                {
                    Subject = "Error Report",
                    Body = $"An error occurred: {ex.Message}\n\nStack Trace:\n{ex.StackTrace}",
                };

                try
                {
                    client.Send(mailMessage);
                    Console.WriteLine("Error email sent successfully.");
                }
                catch (Exception sendEx)
                {
                    LogError(sendEx);
                    Console.WriteLine($"Failed to send the error email: {sendEx.Message}");
                }
            }
        }
        // Anropas vid exception anropar metoder som ger meddelande om ett problem har uppstått på olika sätt 
        public static void ErrorHandler(Exception ex)
        {
            Console.WriteLine(ex.Message);
            SendErrorEmail(ex);
            LogError(ex);
        }
    }
}
