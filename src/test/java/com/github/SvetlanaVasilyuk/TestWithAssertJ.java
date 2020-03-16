package com.github.SvetlanaVasilyuk;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class TestWithAssertJ {

    private static final Logger LOG = LoggerFactory.getLogger(TestWithAssertJ.class);

    public ArrayList<Person> expPersons(){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", "Васильков", 32, true));
        persons.add(new Person("Елена", "Ладошкина", 10, false));
        persons.add(new Person("Константин", "Васильков", 5, false));
        persons.add(new Person("Мария", "Зайцева", 24, true));
        return persons;
    }

    @Test
    public void personsTestAssertJ() {
        LOG.info("Выполняется тест c AssertJ");
        PersonDictionary persons = new PersonDictionary();
        persons.addPersons();
        assertThat(persons.getPersons())
                .as("Проверка наличия человека в списке")
                .contains(new Person("Анна", "Зайцева", 24, true));
        LOG.info("Тест с AssertJ завершен");
    }

    /*@ParameterizedTest
    @MethodSource("stringProvider")
    void testWithExplicitLocalMethodSource(String name, String surname) {
        LOG.info("Выполняется параметризованный тест");
        String greetingAct = personalGreet(name, surname);
        String greetingExp = String.format("Приветствую, %s %s!", name, surname);
        LOG.info("Приветствие: \"" + greetingAct + "\"");
        Assertions.assertEquals(greetingAct, greetingExp, "Приветствие некорректно");
        LOG.info("Параметризованный тест завершен");
    }

    static Stream<Arguments> stringProvider() {
        return Stream.of(
                arguments("Петр", "Николаев"),
                arguments("Ирина", "Дмитриева")
        );
    }*/
}