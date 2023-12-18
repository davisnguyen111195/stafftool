package com.heosoft.stafftool.model;

public class Engineer extends Person{
    private String skill;
    public Engineer(String name, String address, int age, boolean sex, String skill) {
        super(name, address, age, sex);
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "skill='" + skill + '\'' +
                "} " + super.toString();
    }
}
