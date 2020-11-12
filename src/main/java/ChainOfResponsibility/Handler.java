package ChainOfResponsibility;

public interface Handler {

    void setNext(Handler handler);
    void handle(String login, String pass);

}
