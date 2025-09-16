package in.designpattern.creational.builder;

public class SmartStoreBuilder implements StoreBuilder{
    private boolean hasGroceriesProducts;
    private boolean hasElectronicProducts;
    private boolean hasFashionProducts;
    private boolean hasDailyMilkProducts;
    private String name;
    private Address address;
    private String phone;

    @Override
    public void setHasGroceriesProducts(boolean hasGroceriesProducts) {
        this.hasGroceriesProducts = hasGroceriesProducts;
    }

    @Override
    public void setHasElectronicProducts(boolean hasElectronicProducts) {
        this.hasElectronicProducts = hasElectronicProducts;
    }

    @Override
    public void setHasFashionProducts(boolean hasFashionProducts) {
        this.hasFashionProducts = hasFashionProducts;
    }

    @Override
    public void setHasDailyMilkProducts(boolean hasFashionProducts) {
        this.hasFashionProducts = hasFashionProducts;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAddress(String road, String block, String landmark) {
        this.address = new Address(road, block, landmark);
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Store build() {
        return new Store(hasGroceriesProducts, hasElectronicProducts, hasFashionProducts, hasDailyMilkProducts, name, address, phone);
    }
}
