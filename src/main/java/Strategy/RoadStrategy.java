package Strategy;

public class RoadStrategy implements Strategy {

    @Override
    public void execute(int a, int b) {
        System.out.println("trap by road from " + a + " to " + b + " was build");
    }
}
