package test.creational.singleton;

public class SingletonDPEagerInitialization {
    private static SingletonDPEagerInitialization iSelf = new SingletonDPEagerInitialization();

    private SingletonDPEagerInitialization() {}

    public static SingletonDPEagerInitialization getInstance() {
        return iSelf;
    }

    public void display() {
        System.out.println("""
                Object created using Singletone DP Eager Initialization... 
                """);
    }
}
