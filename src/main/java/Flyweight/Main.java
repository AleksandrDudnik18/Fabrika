package Flyweight;

public class Main {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Context context = new Context(5, "picture", flyweightFactory);

        context.operation();

        Context context1 = new Context(500000, "picture", flyweightFactory);

        context1.operation();


    }

}
