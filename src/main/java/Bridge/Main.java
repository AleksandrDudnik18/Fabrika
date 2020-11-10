package Bridge;

import AbstractFactory.Factories.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        Abstraction abstraction = new Abstraction(new Windows());
        abstraction.featureOne();
        abstraction.featureTwo();

        System.out.println();

        Abstraction abstraction1 = new Abstraction(new Mac());
        abstraction1.featureThird();

        System.out.println();

        Abstraction abstraction2 = new Abstraction(new Linux());
        abstraction2.featureTwo();
        abstraction2.featureThird();


    }
}
