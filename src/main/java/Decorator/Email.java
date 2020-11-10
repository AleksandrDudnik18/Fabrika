package Decorator;

public class Email implements Component{


    @Override
    public void send() {
        System.out.println("your message sent to email");
    }
}
