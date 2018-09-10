package edu.just.collection;

import java.util.*;

public class CollectionTest {

    abstract static class Super {
        public static String getType(Collection<?> collection) {
            return "super: collection";
        }

        public static String getType(List<?> list) {
            return "super:list";
        }

        public static String getType(Set<?> set) {
            return "super: set";
        }

        public static String getType(HashSet<?> hashSet) {
            return "super: hashset";
        }
    }

    static class Sub extends Super {
        public static String getType(Collection<?> collection) {
            return "sub";
        }
    }

    public static void main(String[] args) {
        Collection<?> [] collections = {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};
        Super subToSuper = new Sub();

        for (Collection<?> collection: collections) {
            System.out.println(subToSuper.getType(collection));
        }
    }

}
