package com.sda.she_likes_java.string;

public class ImmutableString {
    public static void main(String[] args) {
        String name = "Ramune ";
        name=name.concat("Pakalniskiene ");
        name=name.concat("Is 40");

        System.out.println("My name now " + name);

        StringBuilder nameWithBuilder = new StringBuilder("Ramune ");
        nameWithBuilder.append(" Pakalniskiene");
        nameWithBuilder.append(" Pakalniskiene");
        nameWithBuilder.append(" Pakalniskiene");
        nameWithBuilder.append(" Pakalniskiene");

        System.out.println("Name with builder " + nameWithBuilder);

    }
}
