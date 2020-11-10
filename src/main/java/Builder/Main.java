package Builder;

public class Main {
    public static void main(String[] args) {

        CityHouseBuilder cityHouseBuilder = new CityHouseBuilder();

        Director director = new Director(cityHouseBuilder);
        director.make("Simple");
        var house = cityHouseBuilder.getCityHouse();

        System.out.println(house);

    }
}
