package Strategy;

public class WalkingStrategy implements Strategy {
    @Override
    public void execute(int a, int b) {
        System.out.println("trap by walking from " + a + " to " + b + " was build");
    }
}
