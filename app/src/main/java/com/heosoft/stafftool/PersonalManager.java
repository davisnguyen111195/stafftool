package com.heosoft.stafftool;

import com.heosoft.stafftool.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonalManager {
    private List<Person> personList;

    public PersonalManager(List<Person> personList) {
        this.personList = new ArrayList<>();
    }

    public void Add(Person person) {
        this.personList.add(person);
    }

    public List<Person> Search(String name) {
        List<Person> result = new ArrayList<>();
        for(Person person : this.personList) {
            if(person.getName().contains(name)) {
                result.add(person);
            }
        }
        return result;
    }

    public void ShowAll() {
        for (Person person : this.personList) {
            System.out.println(person.toString());
        }
    }
}
