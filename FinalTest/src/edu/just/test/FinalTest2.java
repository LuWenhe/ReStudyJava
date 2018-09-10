package edu.just.test;

public class FinalTest2 {

    private final Person person = new Person(1,"luwenhe");

    public void change() {
        person.setName("xiixix");
        System.out.println(person.getName());
    }

    /*public void change(Person person) {
        this.person = person;
    }*/

    public static void main(String[] args) {
        FinalTest2 finalTest2 = new FinalTest2();
        finalTest2.change();
    }

}
