package AbstractFactory;

import AbstractFactory.Factories.AbstractFactory;
import AbstractFactory.Factories.NewDecorFactory;
import AbstractFactory.Factories.VictorianDecorFactory;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(new NewDecorFactory());

        client.concrete();
        client.setAbstractFactory(new VictorianDecorFactory());

        client.concrete();



//        Client client1 = new Client(new VictorianDecorFactory());

    }

}
