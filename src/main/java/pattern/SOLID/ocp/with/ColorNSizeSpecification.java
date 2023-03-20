package pattern.SOLID.ocp.with;

import pattern.SOLID.ocp.without.Color;
import pattern.SOLID.ocp.without.Product;
import pattern.SOLID.ocp.without.Size;

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
