package edu.just.inherit;

public class ManagerTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        boolean equals = employee.equals(manager);
        boolean equals1 = manager.equals(employee);
        System.out.println(equals);
        System.out.println(equals1);
    }

}
