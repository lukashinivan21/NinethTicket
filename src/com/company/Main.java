package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        personList.add(new Person("John", 28));
        personList.add(new Person("Steven", 31));
        personList.add(new Person("Frank", 22));
        personList.add(new Person("Bill", 37));

        String name = "Anna";

        try {
            findPersonByName(name);
        } catch (PersonNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static final List<Person> personList = new ArrayList<>();

    private static Person findPersonByName(String name) {

        Person result = null;

        for (Person person : personList) {
            if (person.getName().equals(name)) {
                result = person;
                break;
            }
        }

        if (result == null) {
            throw new PersonNotFoundException("List doesn't contain person with name " + name);
        }

        return result;
    }
}
