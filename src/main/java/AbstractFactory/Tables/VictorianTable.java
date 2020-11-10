package AbstractFactory.Tables;

public class VictorianTable extends Table {

    public VictorianTable(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "it is " + name + " of new victorian table";
    }

}
