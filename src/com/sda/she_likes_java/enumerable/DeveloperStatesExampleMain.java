package com.sda.she_likes_java.enumerable;

public class DeveloperStatesExampleMain {
    public static void main(String[] args) {
        System.out.println("Hey, let's start the day");
        ProgrammersStates myState = ProgrammersStates.NORMAL;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel " + myState.getDescription());
        System.out.println();

        System.out.println("I've got new task");
        myState = ProgrammersStates.GOD_MODE;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel " + myState.getDescription());
        System.out.println();

        System.out.println("After a while I am exhausted!");
        myState = ProgrammersStates.EXHAUSTED_MODE;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel " + myState.getDescription());
        System.out.println();

        myState = null;
        System.out.println("rebooting system");
        String one = "one-value";
        String two = one;
        // checks if two references points to the same object
        if (one == two) {
            System.out.println("the same object pointed by one and two");

        }
        compareEnums(ProgrammersStates.GOD_MODE);
        System.out.println("Enum methods");
        System.out.println("name: " + ProgrammersStates.GOD_MODE.name());
        System.out.println("ordinal: " + ProgrammersStates.GOD_MODE.ordinal());

        System.out.println();
        System.out.println("ordinal shows Enum position (index) when we changes position of the Enums: " + ProgrammersStates.GOD_MODE.ordinal());
        ProgrammersStates[] allStates = ProgrammersStates.values();
        System.out.println("Should be NORMAL " + allStates[2]);
    }

    public static void compareEnums(ProgrammersStates someStates) {
        if (someStates == ProgrammersStates.GOD_MODE) {
            System.out.println("God mode enabled");
        }

    }
}

