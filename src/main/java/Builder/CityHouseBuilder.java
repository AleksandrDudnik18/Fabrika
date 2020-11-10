package Builder;

public class CityHouseBuilder implements HouseBuilder{

    private CityHouse cityHouse;

    public CityHouse getCityHouse() {
        return cityHouse;
    }

    @Override
    public void roof() {
        cityHouse.setRoof("cool roof");
    }

    @Override
    public void walls() {
        cityHouse.setRoof("cool walls");
    }

    @Override
    public void basement() {
        cityHouse.setRoof("cool basement");
    }

    @Override
    public void reset() {
        cityHouse = new CityHouse();
    }
}
