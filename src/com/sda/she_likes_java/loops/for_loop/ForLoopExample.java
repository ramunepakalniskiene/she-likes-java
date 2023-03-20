package com.sda.she_likes_java.loops.for_loop;

public class ForLoopExample {
    public static void main(String[] args) {
        for (
                int number = 0; // initialization part - executed only once
                number<100; // condition of the loop
                number++ //executed as last instruction in current iteration
        ){
            System.out.println("Number value is: " + number);

        }
        int number=0;
        while(number<100){
            System.out.println("Number value is: " + number);
            number++;
        }
    }
}
