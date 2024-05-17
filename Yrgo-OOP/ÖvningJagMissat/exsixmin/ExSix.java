package exsixmin;

import java.util.Scanner;

public class ExSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double convertFrom = 0;
        double convertTo = 0;
        double finalExchange = 0;

        final Exchange[] currencyRate = {
                new Exchange(1.01, "GBP"),
                new Exchange(1, "EUR"),
                new Exchange(0.092, "NOK"),
                new Exchange(0.13, "DKK"),
                new Exchange(0.096, "SEK") };

        System.out.println("What currency do you wish to exchange?");
        for (Exchange exchange : currencyRate) {
            System.out.println(exchange.toString());
        }
        String currencyIn = input.nextLine().toLowerCase().trim();

        if (currencyIn.equals("gbp")) {
            convertFrom = currencyRate[0].convertToEuro(1.01);
        } else if (currencyIn.equals("eur")) {
            convertFrom = currencyRate[1].convertToEuro(1);
        } else if (currencyIn.equals("nok")) {
            convertFrom = currencyRate[2].convertToEuro(0.092);
        } else if (currencyIn.equals("dkk")) {
            convertFrom = currencyRate[3].convertToEuro(0.13);
        } else if (currencyIn.equals("sek")) {
            convertFrom = currencyRate[4].convertToEuro(0.096);
        } else {
            System.out.println("We don't exchange that currency");
        }

        System.out.println("What currency do you wish to exchange to?");
        for (Exchange exchange : currencyRate) {
            System.out.println(exchange.toString());
        }
        String currencyOut = input.nextLine().toLowerCase().trim();

        if (currencyOut.equals("gbp")) {
            convertTo = currencyRate[0].convertFromEuro(1.01);
        } else if (currencyOut.equals("eur")) {
            convertTo = currencyRate[1].convertFromEuro(1);
        } else if (currencyOut.equals("nok")) {
            convertTo = currencyRate[2].convertFromEuro(0.092);
        } else if (currencyOut.equals("dkk")) {
            convertTo = currencyRate[3].convertFromEuro(0.13);
        } else if (currencyOut.equals("sek")) {
            convertTo = currencyRate[4].convertFromEuro(0.096);
        } else {
            System.out.println("We don't exchange that currency");
        }
        System.out.println("How much do you wish to exchange?");

        double amount = input.nextDouble();
        finalExchange = convertFrom * convertTo * amount;

        System.out.printf("You now have %f", finalExchange);
    }
}
