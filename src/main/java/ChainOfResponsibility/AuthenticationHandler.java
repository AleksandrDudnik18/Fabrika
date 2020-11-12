package ChainOfResponsibility;

public class AuthenticationHandler extends BaseHandler {

    public AuthenticationHandler() {
    }

    protected boolean canHandler(String login, String pass) {

        return !login.equals("admin");

    }

    @Override
    public void handle(String login, String pass) {

        if (canHandler(login, pass)) {

            System.out.println("you haven't authentication");

        } else {
            System.out.println("success Authentication");
            super.handle(login, pass);
        }

    }


}
