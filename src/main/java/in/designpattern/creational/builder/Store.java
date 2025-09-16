package in.designpattern.creational.builder;

public class Store {
    private boolean hasGroceriesProducts;
    private boolean hasElectronicProducts;
    private boolean hasFashionProducts;
    private boolean hasDailyMilkProducts;
    private String name;
    private Address address;
    private String phone;

    public Store(boolean hasGroceriesProducts, boolean hasElectronicProducts, boolean hasFashionProducts, boolean hasDailyMilkProducts, String name, Address address, String phone) {
        this.hasGroceriesProducts = hasGroceriesProducts;
        this.hasElectronicProducts = hasElectronicProducts;
        this.hasFashionProducts = hasFashionProducts;
        this.hasDailyMilkProducts = hasDailyMilkProducts;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public boolean isHasGroceriesProducts() {
        return hasGroceriesProducts;
    }

    public boolean isHasElectronicProducts() {
        return hasElectronicProducts;
    }

    public boolean isHasFashionProducts() {
        return hasFashionProducts;
    }

    public boolean isHasDailyMilkProducts() {
        return hasDailyMilkProducts;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
       return "Store :::: [ Name = " + this.name + " - Address = " + this.address.road() + "," + this.address.landmark() + " - Sell Fashion & Lifestyle Products = " + this.hasFashionProducts + " - Sell Electronic Products = " + this.hasElectronicProducts + " - Sell Dairy Consumables = " + this.hasDailyMilkProducts + " - Sell Groceries =  " + this.hasGroceriesProducts + " ] ";
    }
}

record Address(String road, String block, String landmark) {}
