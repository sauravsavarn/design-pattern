package pattern.observer.example.magazinesubscription.subscriber;

import pattern.observer.example.magazinesubscription.model.Message;

public interface Subscriber {

    void notify(Message msg);
}
