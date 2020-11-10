package Decorator;

public class TelegramDecorator implements Component {

    private Component wrapper;

    public TelegramDecorator(Component wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void send() {

        System.out.println("your message sent to telegram");

        wrapper.send();

    }
}
