package com.sda.she_likes_java.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String nick = optionalNick().get();
        System.out.println(nick);
//
//        String nick2 = emptyNick().get();
//        System.out.println(nick2);

        if (emptyNick().isPresent()) {
            System.out.println("Is it empty" + emptyNick().get());
        }
        optionalNick().ifPresent(s -> System.out.println("Lambda 1: nick is " + s));
        emptyNick().ifPresent(s -> System.out.println("Lambda 2: nick is" + s));

    }

    public static String personNick() {
        return null;
    }

    public static Optional<String> emptyNick() {
        return Optional.empty();

    }

    public static Optional<String> optionalNick() {
        return Optional.of("maniek");
    }
}
