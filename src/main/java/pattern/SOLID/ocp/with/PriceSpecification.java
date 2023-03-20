package pattern.SOLID.ocp.with;

import pattern.SOLID.ocp.without.Product;

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
