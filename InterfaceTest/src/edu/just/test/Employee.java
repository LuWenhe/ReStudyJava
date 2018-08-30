package edu.just.test;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSal(double byParent) {
        double raise = salary * byParent / 100;
    }

    @Override
    public int compareTo(Employee o) {
        if(salary < o.salary) {
            return -1;
        }

        if (salary > o.salary){
            return 1;
        }

        return 0;
    }
}
