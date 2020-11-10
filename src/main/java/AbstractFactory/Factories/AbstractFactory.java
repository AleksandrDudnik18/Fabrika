package AbstractFactory.Factories;

import AbstractFactory.AmChairs.AmChair;
import AbstractFactory.Tables.Table;

public interface AbstractFactory {

    Table createTable();
    AmChair createAmChair();

}
