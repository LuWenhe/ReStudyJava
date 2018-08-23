package edu.just.order;

import org.junit.Test;

public class FlowTest {

    @Test
    public void testBreak(){
        int i = 0;

        outer:
        while (true){

            System.out.println("i: " + i);

            while (true){
                i++;
                System.out.println("i = " + i);
                if (i == 1){
                    System.out.println("continue outer");
                    continue;
                }

                if (i == 3){
                    System.out.println("continue outer");
                    continue outer;
                }

                if (i == 5){
                    System.out.println("break");
                    break;
                }

                if (i == 7){
                    System.out.println("break outer");
                    break outer;
                }
            }
        }
    }

    @Test
    public void testForLabel(){
        int i = 0;
        outer:
        for(; true; ){
            inner:
            for(; i<10; i++){
                System.out.println("i = " + i);
                if(i == 2){
                    System.out.println("continue");
                    continue;
                }

                if(i == 3){
                    System.out.println("break");
                    i++;
                    break;
                }

                if(i == 7){
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }

                if(i == 8){
                    System.out.println("break outer");
                    break outer;
                }

                for(int k=0; k<5; k++){
                    if(k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }

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
