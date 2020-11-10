package AbstractFactory.AmChairs;

public class VictorianChair extends AmChair {

    public VictorianChair(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "it is " + name + " of new victorian chair";
    }

}
