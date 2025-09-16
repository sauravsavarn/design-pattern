package test.behavioural.observer;

public class SMSNotificationObserver  implements Notification{
    @Override
    public void notifies() {
        System.out.println("""
                SMSNotification is raised. 
                 -> Send SMS to the list of recipients""");
    }
}
