package in.designpattern.behavioural.observer.eg2.magazinesubscription.publisher;

import in.designpattern.behavioural.observer.eg2.magazinesubscription.subscriber.Subscriber;
import in.designpattern.behavioural.observer.eg2.magazinesubscription.model.Message;

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
