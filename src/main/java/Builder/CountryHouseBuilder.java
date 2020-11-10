package Builder;

public class CountryHouseBuilder implements HouseBuilder {

    private CountryHouse countryHouse;

    public CountryHouse getCountryHouse() {
        return countryHouse;
    }

    @Override
    public void roof() {
        countryHouse.setRoof("usually roof");
    }

    @Override
    public void walls() {
        countryHouse.setRoof("usually walls");
    }

    @Override
    public void basement() {
        countryHouse.setRoof("usually basement");
    }

    @Override
    public void reset() {
        countryHouse = new CountryHouse();
    }
}
