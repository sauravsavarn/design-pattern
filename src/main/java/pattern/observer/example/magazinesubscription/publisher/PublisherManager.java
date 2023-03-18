package pattern.observer.example.magazinesubscription.publisher;

import pattern.observer.example.magazinesubscription.model.Message;
import pattern.observer.example.magazinesubscription.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class PublisherManager implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(Message message) {
        subscribers.forEach(subscriber -> subscriber.notify(message));
    }
}