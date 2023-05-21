package com.sda.she_likes_java.homework.excercise_28;

import java.util.Comparator;
import java.util.Objects;

public class ComparatorTask implements Comparator<ComparatorTask> {
    private String name;
    private String surname;
    private String city;
    private String country;

    public ComparatorTask(String name, String surname, String city, String country) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int compare(ComparatorTask o1, ComparatorTask o2) {
        return o1.name.compareTo(o2.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComparatorTask that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getSurname(), that.getSurname()) && Objects.equals(getCity(), that.getCity()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getCity(), getCountry());
    }

    @Override
    public String toString() {
        return "ComparatorTask{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
