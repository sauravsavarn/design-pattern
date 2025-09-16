package in.designpattern.creational.builder;

public interface StoreBuilder {
    public void setHasGroceriesProducts(boolean hasGroceriesProducts);
    public void setHasElectronicProducts(boolean hasElectronicProducts);
    public void setHasFashionProducts(boolean hasFashionProducts);
    public void setHasDailyMilkProducts(boolean hasDailyMilkProducts);
    public void setName(String name);
    public void setAddress(String road, String block, String landmark);
    public void setPhone(String phone);

}
