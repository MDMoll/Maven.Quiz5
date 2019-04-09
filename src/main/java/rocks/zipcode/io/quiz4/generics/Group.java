package rocks.zipcode.io.quiz4.generics;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<T> {
    List<T> group = new ArrayList<>();
    
    public Group() {
    }
    
    public Integer count() {
        return group.size();
    }
    
    public void insert(T value) {
        group.add(value);
    }
    
    public Boolean has(T value) {
        return group.contains(value);
    }
    
    public T fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }
    
    public void delete(T value) {
        group.remove(value);
    }
    
    public void clear() {
        group.clear();
    }
    
    public Iterator<? extends T> iterator() {
        return group.iterator();
    }
}
