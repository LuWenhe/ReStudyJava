package edu.just.abstract1;

public class Test {

    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Employee("luwenhe");
        people[1] = new Student("luwenhe2");

        for (Person p: people){
            System.out.println(p.getName() + " " + p.getDescription());
        }

        Person person = new Employee("e");
        person.getName();
    }

}
