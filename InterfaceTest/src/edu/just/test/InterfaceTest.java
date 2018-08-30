package edu.just.test;

import java.util.Arrays;

public class InterfaceTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("luwenhe5", 4000);
        employees[1] = new Employee("luwenhe3", 6000);
        employees[2] = new Employee("luwenhe2", 5000);

        Arrays.sort(employees);

        for (Employee employee: employees){
            System.out.println("name: " + employee.getName() +
                    " ,slary: " + employee.getSalary());
        }

        Comparable c = new Employee("ll", 100);
    }

}
