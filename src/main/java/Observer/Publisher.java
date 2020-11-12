package Observer;

import java.util.LinkedList;
import java.util.List;

public class Publisher {

    private final List<Subscriber> subscribers;
    private String magazine;

    public Publisher() {
        this.subscribers = new LinkedList<Subscriber>();
    }

    public String getMagazine() {
        return magazine;
    }

    public void subscribe(Subscriber subscriber) {

        subscribers.add(subscriber);

    }

    public void unsubscribe(Subscriber subscriber) {

        subscribers.remove(subscriber);

    }

    public void notifySubscribe() {

        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }

    }

    public void receivedNewMagazine(String newNameMagazine) {
        magazine = newNameMagazine;
        notifySubscribe();
    }



}
