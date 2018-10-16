package edu.just.generic;

class Employee {

}

class Manager extends Employee {

}

class A extends Employee {

}

public class Main {

    public static void print(Pair<? extends Employee> pair) {
        Employee first = pair.getFirst();
        Employee second = pair.getSecond();
        System.out.println(first + " " + second);
    }

    public static void print2(Pair<? super Manager> pair) {
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        System.out.println(first + " " + second);
    }

    public static void swap1(Pair<?> pair) {
        swapHelper(pair);
        Object first = pair.getFirst();
    }

    private static <T> void swapHelper(Pair<T> pair) {
        T t = pair.getFirst();
        pair.setFirst(pair.getSecond());

    }

    public static void main(String[] args) {
        Pair<? extends Employee> pair = new Pair<>();
//        pair.setFirst(new Manager());
        Employee first1 = pair.getFirst();

        Pair<? super Manager> pair1 = new Pair<>();
        pair1.setFirst(new Manager());
        Object first = pair1.getFirst();

        Pair<Employee> employeePair = new Pair<>();
        Pair<Manager> managerPair = new Pair<>();
        Pair<?> pair2 = new Pair<>();
        pair2 = employeePair;

        Pair<?> pair3 = new Pair<A>();
    }

}
