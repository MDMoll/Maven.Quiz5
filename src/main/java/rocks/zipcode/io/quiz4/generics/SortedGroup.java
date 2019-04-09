package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {
    List<T> list = new ArrayList<>();
    @Override
    public void insert(T value) {list.add(value);
    }

    @Override
    public void delete(T value) {list.remove(value);
    }

    public Integer indexOf(T value) {
        return list.indexOf(value);
    }
}
