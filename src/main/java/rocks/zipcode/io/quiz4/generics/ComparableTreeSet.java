package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> implements Comparable<T> {
    public ComparableTreeSet(T... arr) {
    }
    
    public ComparableTreeSet() {
    }
    
    public int compareTo(ComparableTreeSet<T> o) {
        return Integer.valueOf(null);
    }
    
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
