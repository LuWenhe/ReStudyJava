package edu.just.test;

import org.junit.Test;

public class FlowTest {

    @Test
    public void testBreakAndContinue(){
        for (int i=0; i<100; i++){
            if(i == 74) break;
            if(i % 9 != 0) continue;
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if(j == 1269) break;
            if(i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }

    @Test
    public void testForEach(){
        for(char c: "an african swallow".toCharArray()){
            System.out.println(c + " ");
        }
    }

    @Test
    public void testFor(){
        for (char c = 0; c < 128; c++){
            if(Character.isLowerCase(c)){
                System.out.println("value: " + (int)c + " character: " + c);
            }
        }
    }

}
