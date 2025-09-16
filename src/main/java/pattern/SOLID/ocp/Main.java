package pattern.SOLID.ocp;

import pattern.SOLID.ocp.with.*;
import pattern.SOLID.ocp.without.Color;
import pattern.SOLID.ocp.without.Product;
import pattern.SOLID.ocp.without.ProductFilter;
import pattern.SOLID.ocp.without.Size;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Product1", Color.BLACK, Size.MEDIUM);
        Product product2 = new Product("Product2", Color.BLUE, Size.LARGE);
        Product product3 = new Product("Product3", Color.RED, Size.SMALL);
        Product product4 = new Product("Product4", Color.GREEN, Size.HUGE);
        Product product5 = new Product("Product5", Color.PINK, Size.LARGE);
        Product product6 = new Product("Product6", Color.PINK, Size.SMALL, 10.0);
        Product product7 = new Product("Product7", Color.GREEN, Size.MEDIUM, 1.20);

        List<Product> products = List.of(product1, product2, product3, product4, product5, product6, product7);

        // ****************************************************************** //
        // NOTE: In the below call we are violating the OCP by requiring that
        //       whenever we make new filters inside the product filter, we have
        //       to go and change into the ProductFilter Class that is written
        //       and handling all Filtering related Operations.
        //
        //
        // NOTE: The better approach is to use the Specification Pattern that
        //       uses Open Closed Principle (OCP) to make the code open for
        //       extension but closed for modification. Ref DIF ../with/
        // ****************************************************************** //
        ///////Now filtering product using filtering-api written
        Stream<Product> productsFilteredByColorBlack = new ProductFilter().filterByColor(products, Color.BLACK);
        productsFilteredByColorBlack.forEach(product -> System.out.println("Products Filtered Using Color Criteria as BLACK is : " + product.toString()));

        Stream<Product> productsFilteredBySizeLarge = new ProductFilter().filterBySize(products, Size.LARGE);
        productsFilteredBySizeLarge.forEach(product -> System.out.println("Products Filtered Using Size Criteria as LARGE is : " + product.toString()));

        // ****************************************************************** //
        // NOTE: Implementation of ProductBetterFilter
        //
        //       The upside of the below Implementation is that if you want
        //       additional filters, for example, if you want additional
        //       specification, you don't have to change the existing classes
        //       and modify them i.e. no change in Binary Interface is required.
        //       You just use Inheritance and implementation of Interfaces. This
        //       enables the entire code to be much more flexible
        // ****************************************************************** //
        Stream<Product> productBetterFilterByColor = new ProductBetterFilter().filter(products, new ColorSpecification(Color.BLACK));
        productBetterFilterByColor.forEach(product -> System.out.println("Better Products Filtered Using Color Criteria as BLACK is : " + product.toString()));

        Stream<Product> productBetterFilterBySize = new ProductBetterFilter().filter(products, new SizeSpecification(Size.LARGE));
        productBetterFilterBySize.forEach(product -> System.out.println("Better Products Filtered Using Size Criteria as LARGE is : " + product.toString()));

        Stream<Product> productBetterFilterByPrice = new ProductBetterFilter().filter(products, new PriceSpecification(10.0));
        productBetterFilterByPrice.forEach(product -> System.out.println("Better Products Filtered Using Price Criteria as 10.0 is : " + product.toString()));

        Stream<Product> productBetterFilterByBothColorNSize = new ProductBetterFilter().filter(products, new ColorNSizeSpecification(Color.BLUE, Size.LARGE));
        productBetterFilterByBothColorNSize.forEach(product -> System.out.println("Better Products Filtered Using Color Criteria as Black & Size as Large is : " + product.toString()));

    }
}
