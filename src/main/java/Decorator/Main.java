package Decorator;

public class Main {

    public static void main(String[] args) {

        Email email = new Email();
        SlackDecorator slackDecorator = new SlackDecorator(email);
        SkypeDecorator skypeDecorator = new SkypeDecorator(slackDecorator);
//        TelegramDecorator telegramDecorator = new TelegramDecorator(skypeDecorator);

        SuperTelegram superTelegram = new SuperTelegram(skypeDecorator, "test");

        superTelegram.send();

    }

}
