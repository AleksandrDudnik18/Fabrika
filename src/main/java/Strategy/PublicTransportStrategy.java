package Strategy;

public class PublicTransportStrategy implements Strategy {
    @Override
    public void execute(int a, int b) {
        System.out.println("trap by public transport from " + a + " to " + b + " was build");
    }
}
