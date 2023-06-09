package pattern.observer.example.magazinesubscription.subscriber;

import pattern.observer.example.magazinesubscription.model.Message;

public class Reader implements Subscriber {
    String name;

    public Reader() {
        //no-args
    }

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void notify(Message msg) {
        final String message = String.format("Message received by %s having published content %s at %s",
                this.name, msg.getContent(), msg.getDate().toString());
        System.out.println(message);
    }
}
