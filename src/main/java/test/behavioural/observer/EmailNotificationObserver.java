package test.behavioural.observer;

public class EmailNotificationObserver implements Notification{
    @Override
    public void notifies() {
        System.out.println("""
                EmailNotification is raised. 
                 -> Send mail to the list of recipients""");
    }
}
