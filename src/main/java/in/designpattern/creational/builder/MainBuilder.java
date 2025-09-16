package in.designpattern.creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
        SmartStoreBuilder smartStoreBuilder = new SmartStoreBuilder();

        smartStoreBuilder.setName("Reliance SMART");
        smartStoreBuilder.setAddress("KharadiRoad", "NA", "Near Dhole Patil College");
        smartStoreBuilder.setPhone("123456");
        smartStoreBuilder.setHasDailyMilkProducts(true);
        smartStoreBuilder.setHasFashionProducts(true);
        smartStoreBuilder.setHasGroceriesProducts(true);
        smartStoreBuilder.setHasElectronicProducts(true);

        Store storeRelianceSMART = smartStoreBuilder.build();
        System.out.println("Store setup = " + storeRelianceSMART.toString());



    }
}
