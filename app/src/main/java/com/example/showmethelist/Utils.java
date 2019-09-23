package com.example.showmethelist;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Person> getList() {
        new IPerson() {
            @Override
            public List<Person> getPeople() {
                List<Person> people = new ArrayList<>();
                people.add(new Person("Michael", "Jordan", "mj23@bulls.com", "2123452321", ""));

                return people;
            }
        };

        return new ArrayList<>();
    }
}
