package com.github.SvetlanaVasilyuk;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean worker;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorker() {
        return worker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorker(boolean worker) {
        this.worker = worker;
    }

    public Person(String name, String surname, int age, boolean worker) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.worker = worker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                worker == person.worker &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, worker);
    }
}
