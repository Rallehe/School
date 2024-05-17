# NilexAdvania

Det här programmet hämtar all CI data från Advania (Vårgårda/Herrljunga) och Nilex för att sedan jämföra
datan och se om det finns nya ordrar från Advania och lägger då in dom i Nilex.

Om programmet kraschar så hamnar loggfilerna under: NilexAdvania\bin\Debug\net6.0\errorlog 

Felmeddelanden:
400: Något är fel med url/username/password/apikey
Se till att allt är rätt i "Secrets.cs" filen.

401: Något är fel med Token
Den token som har genererats har blivit fel, prova igen annars felsök (osäker på vad som kan ha blivit fel då)

Om ni önskar lägga till fler fält i Nilex följ dessa steg.
1. Hämta all data från Nilex och Advania i postman eller annat API-verktyg.
2. Gå in i CreateJson.cs, Lägg in fälten du vill hämta ut från Advania i (CreateAdvaniaEntityListOfJsonObjects).
3. Lägg in variabeln i konstruktorn längre ner i samma metod.
4. Gå in i Entity.cs, Skapa en ny variabel med get/set och lägg till i konstruktorn.
5. Gå in i SendOrderToNilex.cs, Lägg till den nya variabeln och koppla fältet med den datan du vill skicka in i Nilex.

Hårdkodade variabler:
Procurement type = 2
Sätter anskaffningstyp till "Leasad"

VendorId = 1
Sätter leverantör till "Advania Sverige AB / 330-4086"

CiStateId = 1
Sätter status till "Används", behövs om man ska kunna redigera enheten i efterhand.