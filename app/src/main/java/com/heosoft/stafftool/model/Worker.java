package com.heosoft.stafftool.model;

public class Worker extends Person{
    private int level;
    public Worker(String name, String address, int age, boolean sex, int level) {
        super(name, address, age, sex);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                "} " + super.toString();
    }
}
