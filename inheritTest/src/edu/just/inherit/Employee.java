package edu.just.inherit;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

    private String name;
    private double salary;
    private Date hireDay;

    Employee(){

    }

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        hireDay =calendar.getTime();
        System.out.println("employee cons...");
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    /*public double getSalary(int a){
        System.out.println("a");
        return a;
    }*/

    public double getSalary(int a, int b){
        System.out.println("a b");
        return a;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSal(double byParent) {
        double raise = salary * byParent / 100;
    }

    protected void aa(){

    }

}
