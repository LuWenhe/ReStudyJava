package edu.just.a;

class X {
    public void show(Y y){
        System.out.println("x and y");
    }

    public void show(){
        System.out.println("only x");
    }
}

class Y extends X {
    public void show(Y y){
        System.out.println("y and y");
    }

    public void show(int i){

    }
}

public class Main2 {
    public static void main(String[] args) {
        X x = new Y();
        x.show(new Y());
        x.show();
    }
}
