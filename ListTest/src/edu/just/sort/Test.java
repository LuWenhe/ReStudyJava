package edu.just.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    private static class AscAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    private static class DescAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getAge() - o1.getAge();
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> persoons = new ArrayList<>();
        persoons.add(new Person("EWW", 30));
        persoons.add(new Person("WRE", 10));
        persoons.add(new Person("XCE", 20));
        persoons.add(new Person("ADE", 40));

        System.out.println(persoons);

        Collections.sort(persoons);
        System.out.println(persoons);

        Collections.sort(persoons);
        System.out.println(persoons);

        Person person = new Person("FGD", 20);
        Person person1 = new Person("AAA", 50);
        Person person2= new Person("BBB", 40);
        Person person3 = new Person("DDD", 10);

        int i = person.compareTo(person1);
        System.out.println(i);
    }

}
