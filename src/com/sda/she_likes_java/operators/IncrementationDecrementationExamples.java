package com.sda.she_likes_java.operators;

public class IncrementationDecrementationExamples {
    public static void main(String[] args) {
        int one = 10;
        int two = 10;

        one++; //10+1 postincrementation
        two--; //10-1 postdecrementation

        System.out.println("Value one is 10 one++ means then 10 + 1 and afterwords value one became eleven: " + one);
        System.out.println("Value two is 10 two-- means 10 - 1 so value two became nine: " + two);

        ++one; // 1+11 preincrementation
        --two; // 1-9  predecrementation

        System.out.println("Value one is 11 + 1  and afterwords it on became twelve: " + one);
        System.out.println("Value two is 9 - 1 and afterwords it became eight: " + two);

        System.out.println("-----------");

        int three = one++;

        System.out.println("Three value is " + one);
        System.out.println("Three value is " + three);


        System.out.println("Incrementation explanation... ");
        int four = one++;
        System.out.println("One value is " + one);
        System.out.println("post-incrementation is going to assign to four variable current value of one and later " +
                "we going to increase value of one" + four);
        four= ++one;
        System.out.println("one value is: " + one);
        System.out.println("four value is: " + four);
        System.out.println("pre-incrementation - first increment, later use new value is assigment expression");

    }

}
