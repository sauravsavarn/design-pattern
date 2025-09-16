package in.designprinciple.SOLID.ocp.with;

/**
 * Specification is a generic interface. It takes a type parameter T and it has a single method
 * which returns a boolean, which determines if a particular product satisfies a criteria.
 *
 * NOTE: we're not constrained just by product where we can filter just about anything that
 *       we want, then we can satisfy particular criteria on any object that we want. So the
 *       object type here is going to be T
 */
public interface Specification<T> {
    boolean isSatisfied(T item);
}
