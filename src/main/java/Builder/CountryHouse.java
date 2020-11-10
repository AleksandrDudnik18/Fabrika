package Builder;

public class CountryHouse {

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
        return "CountryHouse{" +
                "wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                ", basement='" + basement + '\'' +
                '}';
    }
}
