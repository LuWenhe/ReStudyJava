package edu.just.function;

public class FunctionTest {

    String str = new String("luwenhe");
    char[] ch = {'a', 'b', 'c'};

    public void change(String str, char[] ch) {
        str = "luwenhe1";
        ch[0] = 'g';
    }

    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        functionTest.change(functionTest.str, functionTest.ch);
        System.out.println(functionTest.str);
        System.out.println(functionTest.ch);

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

}
