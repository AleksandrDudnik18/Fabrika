package Decorator;

public class SuperTelegram extends TelegramDecorator{

    private String specialMessage;

    public SuperTelegram(Component wrapper, String specialMessage) {
        super(wrapper);
        this.specialMessage = specialMessage;
    }

    @Override
    public void send() {

        System.out.println("extra telegram - special message: " + specialMessage);
        super.send();

    }
}
