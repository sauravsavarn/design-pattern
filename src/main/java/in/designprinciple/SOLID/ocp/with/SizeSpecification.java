package in.designprinciple.SOLID.ocp.with;

import in.designprinciple.SOLID.ocp.without.Product;
import in.designprinciple.SOLID.ocp.without.Size;

public class SizeSpecification implements Specification<Product> {
    Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
