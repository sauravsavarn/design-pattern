package pattern.SOLID.ocp.with;

import pattern.SOLID.ocp.without.Color;
import pattern.SOLID.ocp.without.Product;

public class ColorSpecification implements Specification<Product> {
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return color == product.color;
    }
}
