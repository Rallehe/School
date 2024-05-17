# NilexAdvania

Det h�r programmet h�mtar all CI data fr�n Advania (V�rg�rda/Herrljunga) och Nilex f�r att sedan j�mf�ra
datan och se om det finns nya ordrar fr�n Advania och l�gger d� in dom i Nilex.

Om programmet kraschar s� hamnar loggfilerna under: NilexAdvania\bin\Debug\net6.0\errorlog 

Felmeddelanden:
400: N�got �r fel med url/username/password/apikey
Se till att allt �r r�tt i "Secrets.cs" filen.

401: N�got �r fel med Token
Den token som har genererats har blivit fel, prova igen annars fels�k (os�ker p� vad som kan ha blivit fel d�)

Om ni �nskar l�gga till fler f�lt i Nilex f�lj dessa steg.
1. H�mta all data fr�n Nilex och Advania i postman eller annat API-verktyg.
2. G� in i CreateJson.cs, L�gg in f�lten du vill h�mta ut fr�n Advania i (CreateAdvaniaEntityListOfJsonObjects).
3. L�gg in variabeln i konstruktorn l�ngre ner i samma metod.
4. G� in i Entity.cs, Skapa en ny variabel med get/set och l�gg till i konstruktorn.
5. G� in i SendOrderToNilex.cs, L�gg till den nya variabeln och koppla f�ltet med den datan du vill skicka in i Nilex.

H�rdkodade variabler:
Procurement type = 2
S�tter anskaffningstyp till "Leasad"

VendorId = 1
S�tter leverant�r till "Advania Sverige AB / 330-4086"

CiStateId = 1
S�tter status till "Anv�nds", beh�vs om man ska kunna redigera enheten i efterhand.