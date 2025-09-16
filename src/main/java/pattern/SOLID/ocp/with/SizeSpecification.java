package pattern.SOLID.ocp.with;

import pattern.SOLID.ocp.without.Product;
import pattern.SOLID.ocp.without.Size;

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
