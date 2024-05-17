package exsix;

public class Exchange {
    private double conversionRateToEur;
    private String name;

    public Exchange(String name, double conversionRateToEur) {
        this.name = name;
        this.conversionRateToEur = conversionRateToEur;
    }

    public String getCurrency() {
        return name;
    }

    public double convertToEur(double fromCurrency) {
        return fromCurrency * conversionRateToEur;
    }

    public double convertFromEur(double toCurrency) {
        return toCurrency / conversionRateToEur;
    }
}
