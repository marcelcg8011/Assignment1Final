package com.company;

public class School {
    private String NameOfSchool;
    private Paper[] Papers;
    static final int NUM_PAPERS = 8;
    static final int NUM_PAPERDETAILS = 8;


    public School(String NameOfSchool) {
        this.NameOfSchool = NameOfSchool;

        Papers = new Paper[NUM_PAPERS];

        // Array starts from one for ease of use

        Papers[1] = new Paper("Information Technology Principles", "IT, IS", 158100, 70, 30, 0);
        Papers[2] = new Paper("Web-Based IT Fundamentals", "IT, IS", 158120, 60, 40, 0);
        Papers[3] = new Paper("Applied Programming", "IT, IS, CS, DS, SE", 159101, 50, 50, 0);
        Papers[4] = new Paper("Algorithms and Data Structures", "CS, DS, SE, IS", 159201, 40, 20, 40);
        Papers[5] = new Paper("Object-Oriented Programming", "CS, SE", 159234, 50, 10, 40);
        Papers[6] = new Paper("Database Development", "IT, SE, DS", 158337, 60, 0, 40);
        Papers[7] = new Paper("Professionalism in the Information Sciences", "IT, IS, CS, DS, SE", 158345, 100, 0, 0);
    }
    public String getNameOfSchool() {
        return NameOfSchool;
    }
    public void setNameOfSchool(String NameOfSchool) { this.NameOfSchool = NameOfSchool; }

    public void displayTask1()
    {
        System.out.println("----------------- Task 1 -----------------");
        System.out.println("School Full Name: " + getNameOfSchool());
    }

    public void displayTask2()
    {
        System.out.println();
        System.out.println("----------------- Task 2 -----------------");
        System.out.println("All papers details:");

        for (int i = 1; i < NUM_PAPERDETAILS ; i++)
        {
            Papers[i].displayNumberNameMajors();
        }

    }
}
