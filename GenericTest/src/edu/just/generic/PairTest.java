package edu.just.generic;

public class PairTest {

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
        String min = a[0];
        String max = a[0];

        for (int i = 0; i < a.length; i++) {
            // 遍历的比 min 还小，则将该值赋给 min
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            // 遍历的比 max 还大，则将该值赋给 max
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair();
    }

    public static void main(String[] args) {
        String[] b = {"AAA","BBB","CCC","DDD"};
        minmax(b);
    }

}
