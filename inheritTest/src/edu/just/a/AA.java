package edu.just.a;

public class AA {

    public static void main(String[] args) {
        String a = "lw";
        Class<? extends String> aClass = a.getClass();
        System.out.println(aClass);
    }

}
