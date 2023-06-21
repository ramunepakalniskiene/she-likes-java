package com.sda.she_likes_java.mine_tasks;

public class Output {
    public static void main(String[] args) {
        Output output = new Output();
        output.go();
    }

    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            System.out.println("value 1: " + value);

            if (i > 4) {
                System.out.print(++value + " ");
                System.out.println("value 2: " + value);
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}

