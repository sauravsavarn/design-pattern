package in.designprinciple.SOLID.ocp.with;

import in.designprinciple.SOLID.ocp.without.Color;
import in.designprinciple.SOLID.ocp.without.Product;
import in.designprinciple.SOLID.ocp.without.Size;

public class ColorNSizeSpecification implements Specification<Product> {
    Size size;
    Color color;

    public ColorNSizeSpecification(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size && item.color == color;
    }
}
