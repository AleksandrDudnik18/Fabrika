package ChainOfResponsibility;

abstract public class BaseHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(String login, String pass) {
        if (next != null) {
            next.handle(login, pass);
        }
    }

}
