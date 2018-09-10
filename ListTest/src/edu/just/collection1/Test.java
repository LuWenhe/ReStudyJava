package edu.just.collection1;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test extends AbstractCollection {

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<String> iterator = iterator();
        if(o != null) {
            while (iterator.hasNext()) {
                if(o.equals(iterator.next())){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Collection collection = new ArrayList();
        collection.add("AAA");
        test.removeAll(collection);
    }

}
