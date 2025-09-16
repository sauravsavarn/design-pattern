package pattern.observer.example.magazinesubscription.publisher;

import pattern.observer.example.magazinesubscription.subscriber.Subscriber;
import pattern.observer.example.magazinesubscription.model.Message;

public interface Publisher {
    /**
     * To add subscribers at runtime
     * @param subscriber
     */
    void subscribe(Subscriber subscriber);

    /**
     * To remove subscribers at runtime
     * @param subscriber
     */
    void unsubscribe(Subscriber subscriber);

    /**
     * Call to notify listed Observers/Subscribers when any content is published
     */
    void notifySubscriber(Message message);
}
