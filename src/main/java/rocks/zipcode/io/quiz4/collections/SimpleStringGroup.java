package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{
    List<String> stupidArray = new ArrayList<>();
    public SimpleStringGroup() {
    }
    
    public Integer count() {
        return stupidArray.size();
    }
    
    public void insert(String string) {stupidArray.add(string);
    }
    
    public Boolean has(String string) {
        return stupidArray.contains(string);
    }
    
    public String fetch(int indexOfValue) {
        return stupidArray.get(indexOfValue);
    }
    
    public void delete(String string) {stupidArray.remove(string);
    }
    
    public void clear() {stupidArray.clear();
    }
    
    @Override
    public Iterator iterator() {
        return stupidArray.iterator();
    }
}
