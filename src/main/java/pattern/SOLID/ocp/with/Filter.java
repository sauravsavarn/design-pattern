package pattern.SOLID.ocp.with;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
    /**
     * Here items, which is the items we want to filter, as well as a specification of T, which we
     * want to satisfy so you can see instead of specifying something like color or size specifically,
     * we're making everything very generic and very flexible.
     *
     * @param items
     * @param spec
     * @return
     */
    Stream<T> filter(List<T> items, Specification<T> spec);
}
