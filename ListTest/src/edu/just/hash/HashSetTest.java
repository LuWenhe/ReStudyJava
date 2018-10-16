package edu.just.hash;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    @Test
    public void testHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("AAA");
        hashSet.add("AAA");
        hashSet.add(null);

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

}
