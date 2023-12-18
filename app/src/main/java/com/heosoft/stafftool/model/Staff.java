package com.heosoft.stafftool.model;

public class Staff extends Person{
    private String jobName;

    public Staff(String name, String address, int age, boolean sex, String jobName) {
        super(name, address, age, sex);
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "jobName='" + jobName + '\'' +
                "} " + super.toString();
    }
}
