package Strategy;

public class Main {
    public static void main(String[] args) {

        PublicTransportStrategy publicTransportStrategy = new PublicTransportStrategy();
        RoadStrategy roadStrategy = new RoadStrategy();
        WalkingStrategy walkingStrategy = new WalkingStrategy();

        Navigator navigator = new Navigator();
        navigator.setStrategy(publicTransportStrategy);
        navigator.buildRoute(3, 8);

        System.out.println();

        navigator.setStrategy(roadStrategy);
        navigator.buildRoute(10, 80);

        System.out.println();

        navigator.setStrategy(walkingStrategy);
        navigator.buildRoute(15, 30);

    }
}
