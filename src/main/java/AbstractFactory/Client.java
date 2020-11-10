package AbstractFactory;

import AbstractFactory.AmChairs.AmChair;
import AbstractFactory.Factories.AbstractFactory;
import AbstractFactory.Tables.Table;


public class Client {

    private AbstractFactory abstractFactory;

    public Client(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void concrete() {

        Table table = abstractFactory.createTable();
        AmChair chair = abstractFactory.createAmChair();

        System.out.println(table);
        System.out.println(chair);

    }

}
