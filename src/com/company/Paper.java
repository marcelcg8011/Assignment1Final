package com.company;

public class Paper {
    private String name;
    private String majors;
    private int number;
    private int assignments;
    private int tests;
    private int exam;


    public Paper(String name, String majors, int number, int assignments, int tests, int exam) {
//        this.name = name;

//        this.majors = majors;
//        this.number = number;
//        this.assignments = assignments;
//        this.tests = tests;
//        this.exam = exam;
        setName(name);
        setMajors(majors);
        setNumber(number);
        setAssignments(assignments);
        setTests(tests);
        setExam(exam);

    }

    public void displayNumberNameMajors()
    {
        System.out.println(getNumber() + "  " + getName() + " (" + getMajors() + " )");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAssignments() {
        return assignments;
    }

    public void setAssignments(int assignments) {
        this.assignments = assignments;
    }

    public int getTests() {
        return tests;
    }

    public void setTests(int tests) {
        this.tests = tests;
    }

    public int getExam() {
        return exam;
    }

    public void setExam(int exam) {
        this.exam = exam;
    }
}
