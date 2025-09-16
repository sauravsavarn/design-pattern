package test.creational.singleton;

public class SingletonDPLazyInitialization {
    private static SingletonDPLazyInitialization iSelf;

    private SingletonDPLazyInitialization() {}

    public static  SingletonDPLazyInitialization getInstance() {
        if(iSelf==null)
            iSelf = new SingletonDPLazyInitialization();

        return iSelf;
    }

    public void display() {
        System.out.println("""
                Object created using Singletone DP Lazy Initialization... 
                """);
    }

}
