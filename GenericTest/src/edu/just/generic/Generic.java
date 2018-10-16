package edu.just.generic;

public class Generic<T> {

    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void showKeyValue(Generic<?> obj) {

    }

    public static void main(String[] args) {
        Generic<String> generic = new Generic<>("luwenhe");
        Generic<Integer> generic2 = new Generic<>(123);

        showKeyValue(generic2);
    }
}
