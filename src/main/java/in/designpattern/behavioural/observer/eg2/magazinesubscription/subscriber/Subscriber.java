package in.designpattern.behavioural.observer.eg2.magazinesubscription.subscriber;

import in.designpattern.behavioural.observer.eg2.magazinesubscription.model.Message;

public interface Subscriber {

    void notify(Message msg);
}
