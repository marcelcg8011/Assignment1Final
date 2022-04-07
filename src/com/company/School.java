package com.company;

public class School {
    private String NameOfSchool;

    public School(String NameOfSchool) {
        this.NameOfSchool = NameOfSchool;
    }
    public String getNameOfSchool() {
        return NameOfSchool;
    }
    public void setNameOfSchool(String NameOfSchool) { this.NameOfSchool = NameOfSchool; }

    public void displayNameOfSchool()
    {
        System.out.println("----------------- Task 1 -----------------");
        System.out.println("School Full Name: " + getNameOfSchool());
    }
}
