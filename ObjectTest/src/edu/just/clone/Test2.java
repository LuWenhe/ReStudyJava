package edu.just.clone;

class Address implements Cloneable {

    private String add;

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAdd() {
        return add;
    }

    @Override
    protected Object clone() {
        Address address = null;

        try {
            address = (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return address;
    }
}

class People implements Cloneable {

    private int number;
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    protected Object clone() {
        People people = null;

        try {
            people = (People) super.clone();        //浅复制
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        people.address = (Address) address.clone();  //深复制
        return people;
    }

}

public class Test2 {

    public static void main(String[] args) {
        Address address = new Address();
        address.setAdd("杭州市");

        People people = new People();
        people.setNumber(1000);
        people.setAddress(address);

        People people1 = (People) people.clone();

        System.out.println(people.getNumber() + ", " + people.getAddress().getAdd());
        System.out.println(people1.getNumber() + ", " + people1.getAddress().getAdd());

        people1.setNumber(2000);
        Address address2 = new Address();
        address2.setAdd("上海市");
        people1.setAddress(address2);

        System.out.println(people.getNumber() + ", " + people.getAddress().getAdd());
        System.out.println(people1.getNumber() + ", " + people1.getAddress().getAdd());
    }

}
