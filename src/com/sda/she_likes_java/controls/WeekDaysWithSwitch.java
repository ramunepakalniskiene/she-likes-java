package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class WeekDaysWithSwitch {
    public static void main(String[] args) {
//        1...7
//        1 means monday
//         2 means tuesday
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Hey, provide the original number of weekday: ");
        int ordinalNumberOfWeekday = inputReader.nextInt();
        switch (ordinalNumberOfWeekday) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Do not cheat!");

        }

    }
}
