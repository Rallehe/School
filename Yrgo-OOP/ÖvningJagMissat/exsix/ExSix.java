package exsix;

import java.util.Scanner;

public class ExSix {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        // we would in relity use a Map here but we do not
        // know of it yet...

        final Exchange[] currencies = {
                new Exchange("GBP", 1.01),
                new Exchange("EUR", 1.0),
                new Exchange("NOK", 0.092),
                new Exchange("DKK", 0.13),
                new Exchange("SEK", 0.096)
        };

        System.out.println("Vi hanterar växlingar i:");
        for (Exchange e : currencies) {
            System.out.println(e.getCurrency());
        }

        // the following to chunks of code could be refactored
        // into a method to avoid code duplication
        Exchange fromExchange;

        do {
            System.out.println("Vad vill du växla från?");
            String from = scan.next().trim();
            fromExchange = findExchange(currencies, from);
            if (fromExchange == null) {
                System.out.println("Vi hanterar in den valutan.");
            }
        } while (fromExchange == null);

        Exchange toExchange;
        do {
            System.out.println("Vad vill du växla till?");
            String to = scan.next().trim();
            toExchange = findExchange(currencies, to);
            if (toExchange == null) {
                System.out.println("Vi hanterar in den valutan.");
            }

        } while (toExchange == null);
        if (fromExchange != toExchange) { // Do not convert same currencies
            System.out.println("Hur många " + fromExchange.getCurrency() + " vill du växla?");
            // currencies and money should really never be floating point
            // but let's do this for simplicity
            double amount = scan.nextDouble();
            // convert from original currency to EUR and from EUR to new currency
            // to avoid having to track all exchange rates. Probably a bad idea in real life
            double newAmount = toExchange.convertFromEur(fromExchange.convertToEur(amount));
            System.out.printf("Det blir %.2f %s.", newAmount,
                    toExchange.getCurrency());

        } else {
            System.out.println("Du kan inte växla från och till samma valuta.");
        }
    }

    /**
     * Find the exchange for the given currency.
     *
     * @param currencies     the list of all available currencies
     * @param soughtCurrency the name of the currency we want to find
     * @return the exchange for the currency or null if not found.
     */
    private static Exchange findExchange(Exchange[] currencies, String soughtCurrency) {
        soughtCurrency = soughtCurrency.toUpperCase();
        for (Exchange e : currencies) {
            if (soughtCurrency.equals(e.getCurrency())) {
                return e;
            }
        }
        return null;
    }
}