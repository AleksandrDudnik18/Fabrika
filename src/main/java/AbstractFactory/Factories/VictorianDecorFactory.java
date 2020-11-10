package AbstractFactory.Factories;

import AbstractFactory.AmChairs.AmChair;
import AbstractFactory.AmChairs.NewDecorChair;
import AbstractFactory.AmChairs.VictorianChair;
import AbstractFactory.Tables.NewDecorTable;
import AbstractFactory.Tables.Table;
import AbstractFactory.Tables.VictorianTable;

public class VictorianDecorFactory implements AbstractFactory {
    public Table createTable() {
        return new VictorianTable("table 2");
    }

    public AmChair createAmChair() {
        return new VictorianChair("chair 2");
    }
}
