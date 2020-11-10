package Decorator;

public class SkypeDecorator implements Component{

    private Component wrapper;

    public SkypeDecorator(Component wrappee) {
        this.wrapper = wrappee;
    }

    @Override
    public void send() {

        System.out.println("your message sent to skype");

        wrapper.send();

    }
}
