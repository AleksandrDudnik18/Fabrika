package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        Handler h1 = new AuthenticationHandler();
        Handler h2 = new AuthorizationHandler();

        h1.setNext(h2);

//        h1.handle("alex", "admin");
//        h1.handle("alex", "admin");
        h1.handle("admin", "admin");

    }
}
