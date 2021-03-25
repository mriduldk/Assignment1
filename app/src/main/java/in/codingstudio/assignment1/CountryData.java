package in.codingstudio.assignment1;

public class CountryData {

    private final String countryName;
    private final String capital;
    private final String currency;

    public CountryData(String countryName, String capital, String currency) {
        this.countryName = countryName;
        this.capital = capital;
        this.currency = currency;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapital() {
        return capital;
    }

    public String getCurrency() {
        return currency;
    }
}
