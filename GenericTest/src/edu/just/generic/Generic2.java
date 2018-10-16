package edu.just.generic;

public interface Generic2<T> {

    public T next();

}

class Fun<T> implements Generic2<T> {

    @Override
    public T next() {
        return null;
    }

}

class Fun2 implements Generic2<String> {

    @Override
    public String next() {
        return null;
    }
}