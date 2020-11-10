package AbstractFactory.Tables;

public class NewDecorTable extends Table {

    public NewDecorTable(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "it is " + name + " of new decor table";
    }



}
