package in.designpattern.creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        AppConfig appConfig = AppConfig.getInstance();

        System.out.println("Singleton example=======> AppKey :: " + appConfig.getAppKey() + " - AppName :: " + appConfig.getAppName());
    }
}
