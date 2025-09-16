package in.designpattern.behavioural.observer.eg2.magazinesubscription;

import in.designpattern.behavioural.observer.eg2.magazinesubscription.model.Message;
import in.designpattern.behavioural.observer.eg2.magazinesubscription.publisher.Publisher;
import in.designpattern.behavioural.observer.eg2.magazinesubscription.publisher.PublisherManager;
import in.designpattern.behavioural.observer.eg2.magazinesubscription.subscriber.Reader;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        /////Init Subscribers/Listeners/Observer --- they are the reader
        Reader reader1 = new Reader("Saurav");
        Reader reader2 = new Reader("Maa");
        Reader reader3 = new Reader("Choti");
        Reader reader4 = new Reader("Prity");
        Reader reader5 = new Reader("Aalu");

        /////Init Publisher/ --- they are hte magazine publisher
        Publisher publisher = new PublisherManager();

        //// adding the subscribers to listen for the Published content
        publisher.subscribe(reader1);
        publisher.subscribe(reader2);
        publisher.subscribe(reader3);
        publisher.subscribe(reader4);
        publisher.subscribe(reader5);

        /////Create Message to be published
        Message msg = new Message(LocalDateTime.now(), "Publishing content 1", "Savarn");

        /////Finally publish the content
        publisher.notifySubscriber(msg);
    }

}
