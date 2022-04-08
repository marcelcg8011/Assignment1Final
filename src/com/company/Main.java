package com.company;

public class Main {

    public static void main(String[] args)
    {
        School MasseyUniversity = new School("School of Mathematical and Computational Sciences");
        displayInfo();
        MasseyUniversity.displayTask1();
        MasseyUniversity.displayTask2();
        MasseyUniversity.displayTask3();
        MasseyUniversity.displayTask4();
        MasseyUniversity.displayTask5();
        MasseyUniversity.displayTask6();
        MasseyUniversity.displayTask7();
        MasseyUniversity.displayTask8();

    }

    private static void displayInfo()
    {
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("Assignment 1, 159.234 Semester 1 2022");
        System.out.println("Submitted by: Marcel Cantin-Gilmore ID: 17202138");
        System.out.println("My Major at Massey: Computer Science");
        System.out.println("*************************************************");
        System.out.println();
    }
}
