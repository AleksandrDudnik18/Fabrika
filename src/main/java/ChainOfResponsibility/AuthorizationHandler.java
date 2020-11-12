package ChainOfResponsibility;

public class AuthorizationHandler extends BaseHandler {

    public AuthorizationHandler() {
    }

    protected boolean canHandler(String login, String pass) {

//        return null == login || pass == null || login.equals("") || pass.equals("");
            return login.isEmpty() && pass.isEmpty();

    }

    @Override
    public void handle(String login, String pass) {

        if (canHandler(login, pass)) {

            System.out.println("you haven't authorization");

        } else {
            System.out.println("success Authorization");
            super.handle(login, pass);
        }

    }
}
