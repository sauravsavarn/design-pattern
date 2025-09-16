package in.designprinciple.SOLID.ocp.without;

import java.util.List;
import java.util.stream.Stream;

/**
 * Defining a filters, a mechanism which will allow to take a List Of Products and Filter them by
 * particular criteria.
 *
 *
 * PROBLEM ::
 * The problem with this code is that this is OK for, let's say, two criteria, we have sizes and
 * products, so we generate three different methods.
 *
 * Imagine if you had three criteria. Imagine if in addition to color and size, you also had price,
 * for example. So now you would end up with how many, seven methods if you wanted to have every
 * intersection. So that is problematic. That is something that you don't really want to do.
 * And also, the bigger problem, the problem which the open closed principle tries to solve is to say
 * that you shouldn't be jumping into code that's already written. So you want code which is open for
 * extension, but closed for modification. You want some sort of filtering mechanism which is closed
 * to modification after it's been tested, after it's been shipped to clients. Maybe because your
 * clients might already be using a binary snapshot of this code. You don't want to keep modifying it.
 * You want to have something on the side, maybe an extra library or something. So this is actually a
 * problem that you can solve.
 *
 *
 */
public class ProductFilter {
    /**
     * Implementing Product Filter having logic which returns , let's say, a stream of products
     * which satisfy a particular criteria - which here is COLOR
     *
     * @param products
     * @param color
     * @return
     */
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.color == color);
    }

    /**
     * Implementing Product Filter having logic which returns , let's say, a stream of products
     * which satisfy a particular criteria - which here is SIZE
     *
     * @param products
     * @param size
     * @return
     */
    public Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(product -> product.size == size);
    }

    ///////NOTE: Here In this example, we see that for every filter operation the source-code is
    //////       directly changed or modified everytime - which is against the principle of OCP.
    //////       And now again the requirement came to add functionality to add filter by both the
    //////       COLOR & SIZE, which here again can be possible only by change of the code.

    /**
     * Implmenting Product Filter having logic which returns, let's say, a stream of products
     * which satisfy criteria of both COLOR & SIZE>
     *
     * @param products
     * @param color
     * @param size
     * @return
     */
    public Stream<Product> filterByColorNSize(List<Product> products, Color color, Size size) {
        return products.stream().filter(product -> product.color == color && product.size == size);
    }
}
