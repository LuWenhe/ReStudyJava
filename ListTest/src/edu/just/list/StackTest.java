package edu.just.list;

import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void stackTest() {
        Stack<String> stack = new Stack<>();
        stack.push("AAAA");
        stack.push("AAAA");
        stack.push("AAAA");
        stack.push(null);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
