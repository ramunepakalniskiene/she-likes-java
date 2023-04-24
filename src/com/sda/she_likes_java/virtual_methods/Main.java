package com.sda.she_likes_java.virtual_methods;

public class Main {
    public static void main(String[] args) {
        Mammal human = new Human();
        human.whoYouAre();

        Human noHuman = null;

        HumanLife humanLife = new HumanLife();
        humanLife.tellMeWhoYouAre(noHuman);

        Woman woman = new Woman();
        humanLife.tellMeWhoYouAre(woman);

        Man man = new Man();
        humanLife.tellMeWhoYouAre(man);

        System.out.println("Casting objects");
        Human anotherWoman = new Woman();
        Woman castedFromHuman = (Woman) anotherWoman;
//        castedFromHuman.learnJava();

        Man manForSure = new Man();
        Human anotherMan = manForSure;

        humanLife.tryToCastHumanToMan(anotherMan);
        System.out.println("========");
        humanLife.tryToCastHumanToMan(anotherWoman);


    }
}
