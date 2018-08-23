package edu.just.order;

class Employee {

    int x;

    Employee(int a) {
        this.x = a;
    }

}

public class ObjectTest2 {

    static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(100);
        Employee employee1 = new Employee(200);
        System.out.println("交换前：" + employee.x + " " + employee1.x);
        swap(employee, employee1);
        System.out.println("交换后：" + employee.x + " " + employee1.x);
    }

}
