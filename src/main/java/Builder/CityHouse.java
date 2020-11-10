package Builder;

public class CityHouse {

    private String wall;
    private String roof;
    private String basement;

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public String toString() {
        return "CityHouse{" +
                "wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                ", basement='" + basement + '\'' +
                '}';
    }
}
