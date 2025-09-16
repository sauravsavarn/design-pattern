package in.designprinciple.SOLID.ocp.with;

import in.designprinciple.SOLID.ocp.without.Product;

public class PriceSpecification implements Specification<Product> {
    double price;

    public PriceSpecification(double price) {
        this.price = price;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.price == price;
    }
}
