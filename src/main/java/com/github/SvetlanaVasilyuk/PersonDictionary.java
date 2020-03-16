package com.github.SvetlanaVasilyuk;

import java.util.ArrayList;
import java.util.List;

public class PersonDictionary {
    public ArrayList<Person> persons = new ArrayList<Person>();

    public void addPersons(){
        persons.add(new Person("Иван", "Васильков", 32, true));
        persons.add(new Person("Елена", "Ладошкина", 10, false));
        persons.add(new Person("Константин", "Васильков", 5, false));
        persons.add(new Person("Мария", "Зайцева", 24, true));
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }
}
