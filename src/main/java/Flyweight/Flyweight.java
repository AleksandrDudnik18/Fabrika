package Flyweight;

public class Flyweight {

    private String repeatingState;

    public void operation (int uniqueState) {
        System.out.println("repeatingState = " + repeatingState + "; uniqueState = " + uniqueState);
    }

    public Flyweight(String repeatingState) {
        this.repeatingState = repeatingState;
    }
}
