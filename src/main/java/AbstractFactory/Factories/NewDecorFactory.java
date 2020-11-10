package AbstractFactory.Factories;

import AbstractFactory.AmChairs.AmChair;
import AbstractFactory.AmChairs.NewDecorChair;
import AbstractFactory.Tables.NewDecorTable;
import AbstractFactory.Tables.Table;

public class NewDecorFactory implements AbstractFactory {
    public Table createTable() {
        return new NewDecorTable("table 1");
    }

    public AmChair createAmChair() {
        return new NewDecorChair("chair 1");
    }
}
