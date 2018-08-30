package edu.just.inherit;

public class Manager extends Employee {

    private double bouns;

    Manager(){
    }

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bouns = 0;
        System.out.println("Manager cons...");
    }

    @Override
    public double getSalary() {
        System.out.println("get sal");
        return 1;
    }

    public double getSalary(double a){
        System.out.println("sal double");
        return 1;
    }

    public double getSalary(int a) {
        System.out.println("sal int a");
        return 1;
    }

    @Override
    public double getSalary(int a, int b) {
        System.out.println("get sal a b");
        return 1;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void aa() {
    }
}
