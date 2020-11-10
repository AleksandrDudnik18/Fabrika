package Builder;

public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void make(String type) {

        houseBuilder.reset();

        if (type.equals("simple")) {
            houseBuilder.basement();
        } else {
            houseBuilder.roof();
            houseBuilder.walls();
        }

    }

}
