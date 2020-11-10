package Decorator;

public class SlackDecorator implements Component{

    private Component wrapper;

    public SlackDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void send() {

        System.out.println("your message sent to slack");

        wrapper.send();

    }
}
