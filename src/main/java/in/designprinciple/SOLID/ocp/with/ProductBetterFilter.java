package in.designprinciple.SOLID.ocp.with;

import in.designprinciple.SOLID.ocp.without.Product;

import java.util.List;
import java.util.stream.Stream;

/**
 * This class ProductFilter will take care of Filtering Items as well as the Specification.
 */
public class ProductBetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(product -> spec.isSatisfied(product));
    }
}
