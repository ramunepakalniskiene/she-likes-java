package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPerson;

public class UsingFullPersonExample {
    public static void main(String[] args) {
        FullPerson maybeMe = new FullPerson("Ramune","Pkln", 40, null);
        System.out.println("My age: " + maybeMe.getAge());

        maybeMe.setAge(-1);
        System.out.println("My age tomorrow" + maybeMe);
        maybeMe.setAge(41);
        System.out.println("My age tomorrow" + maybeMe);
    }
}
