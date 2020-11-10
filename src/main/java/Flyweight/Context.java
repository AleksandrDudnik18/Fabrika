package Flyweight;

public class Context {

    private int uniqueState;
    private Flyweight flyweight;
    private FlyweightFactory flyweightFactory;


    public Context(int uniqueState, String repeatingState, FlyweightFactory flyweightFactory) {
        this.uniqueState = uniqueState;
        this.flyweight = flyweightFactory.getFlyweight(repeatingState);
        this.flyweightFactory = flyweightFactory;
    }

    protected void operation() {
        flyweight.operation(uniqueState);
    }

}
