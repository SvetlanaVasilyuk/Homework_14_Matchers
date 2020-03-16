package com.github.SvetlanaVasilyuk;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestWithHamcrest {

    private static final Logger LOG = LoggerFactory.getLogger(TestWithHamcrest.class);

    public ArrayList<Person> expPersons(){
        expPersons().add(new Person("Иван", "Васильков", 32, true));
        expPersons().add(new Person("Елена", "Ладошкина", 10, false));
        expPersons().add(new Person("Константин", "Васильков", 5, false));
        expPersons().add(new Person("Мария", "Зайцева", 24, true));
        return expPersons();
    }

    @Test
    public void personsTestHamcrest() {
        LOG.info("Выполняется тест c Hamcrest");
        PersonDictionary persons = new PersonDictionary();
        persons.addPersons();
        assertThat(persons.getPersons(), allOf(hasSize(4), not(hasSize(4))));
        LOG.info("Тест с Hamcrest завершен");
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