package com.sda.she_likes_java.sorting;

import java.util.Objects;

public class SortedPerson implements Comparable<SortedPerson> {
    private final String name;
    private final int age;

    public SortedPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SortedPerson that)) return false;
        return getAge() == that.getAge() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "SortedPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(SortedPerson o) {
//        if age=2 on our instance o.age=3
//        return o.getAge()-age;
        System.out.println("Called by java");
        if (age < o.getAge()) {
            return -1;
        } else if (age > o.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
