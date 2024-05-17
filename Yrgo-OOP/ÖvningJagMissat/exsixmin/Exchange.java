package exsixmin;

public class Exchange {
    private double conversionRate;
    private String name;

    public Exchange(double conversionRate, String name) {
        this.conversionRate = conversionRate;
        this.name = name;

    }
    public String getCurrency() {
        return name;
    }

    public double convertFromEuro(double fromCurrency) {
        return fromCurrency * conversionRate;
    }

    public double convertToEuro(double toCurrency) {
        return toCurrency / conversionRate;
    }
    @Override
    public String toString() {
        return conversionRate + " " + name;
    }
}
