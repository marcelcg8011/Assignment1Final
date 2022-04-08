package com.company;

public class School {
    private String NameOfSchool;
    private Paper[] Papers;
    private AucklandPaper[] AucklandPapers;
    private PalmerstonPaper[] PalmerstonPapers;
    private DistancePaper[] DistancePapers;
    static final int NUM_PAPERS = 8;


    public School(String NameOfSchool) {

        setNameOfSchool(NameOfSchool);

        Papers = new Paper[NUM_PAPERS];

        // Array starts from one for ease of use

        Papers[1] = new Paper("Information Technology Principles", "IT, IS", 158100, 70, 30, 0);
        Papers[2] = new Paper("Web-Based IT Fundamentals", "IT, IS", 158120, 60, 40, 0);
        Papers[3] = new Paper("Applied Programming", "IT, IS, CS, DS, SE", 159101, 50, 50, 0);
        Papers[4] = new Paper("Algorithms and Data Structures", "CS, DS, SE, IS", 159201, 40, 20, 40);
        Papers[5] = new Paper("Object-Oriented Programming", "CS, SE", 159234, 50, 10, 40);
        Papers[6] = new Paper("Database Development", "IT, SE, DS", 158337, 60, 0, 40);
        Papers[7] = new Paper("Professionalism in the Information Sciences", "IT, IS, CS, DS, SE", 158345, 100, 0, 0);

        AucklandPapers = new AucklandPaper[NUM_PAPERS];

        AucklandPapers[1] = new AucklandPaper(158100);
        AucklandPapers[2] = new AucklandPaper(158120);
        AucklandPapers[3] = new AucklandPaper(159101);
        AucklandPapers[4] = new AucklandPaper(159201);
        AucklandPapers[5] = new AucklandPaper(159234);
        AucklandPapers[6] = new AucklandPaper(158337);
        AucklandPapers[7] = new AucklandPaper(158345);

        PalmerstonPapers = new PalmerstonPaper[NUM_PAPERS];

        PalmerstonPapers[1] = new PalmerstonPaper(158100);
        PalmerstonPapers[2] = new PalmerstonPaper(158120);
        PalmerstonPapers[3] = new PalmerstonPaper(159101);
        PalmerstonPapers[4] = new PalmerstonPaper(159201);
        PalmerstonPapers[5] = new PalmerstonPaper(159234);
        PalmerstonPapers[6] = new PalmerstonPaper(158337);
        PalmerstonPapers[7] = new PalmerstonPaper(158345);

        DistancePapers = new DistancePaper[NUM_PAPERS];

        DistancePapers[1] = new DistancePaper(158100);
        DistancePapers[2] = new DistancePaper(158120);
        DistancePapers[3] = new DistancePaper(159101);
        DistancePapers[4] = new DistancePaper(159201);
        DistancePapers[5] = new DistancePaper(159234);
        DistancePapers[6] = new DistancePaper(158337);
        DistancePapers[7] = new DistancePaper(158345);



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

        for (int i = 1; i < NUM_PAPERS; i++)
        {
            Papers[i].displayNumberNameMajors();
        }

    }

    public void displayTask3()
    {
        String testerCS;
        int counterCS = 0;
        System.out.println();
        System.out.println("----------------- Task 3 -----------------");
        System.out.println("Papers that belong to CS major:");

        for (int i = 1; i < NUM_PAPERS; i++)
        {
            testerCS = Papers[i].getMajors();

            if (testerCS.contains("CS"))
            {
                System.out.println("Paper -  " + Papers[i].getNumber() + " " + Papers[i].getName());
                counterCS++;
            }
        }
        System.out.println("Total matching papers in specified Major - CS: " + counterCS);
    }

    public void displayTask4()
    {
        int testerExam;
        int counterExam = 0;
        System.out.println();
        System.out.println("----------------- Task 4 -----------------");
        System.out.println("Papers that have an exam:");

        for (int i = 1; i < NUM_PAPERS; i++)
        {
            testerExam = Papers[i].getExam();

            if (testerExam != 0)
            {
                System.out.println("Paper -  " + Papers[i].getNumber() + " " + Papers[i].getName());
                counterExam++;
            }
        }
        System.out.println("Total number of papers that have an exam: " + counterExam);
    }

    public void displayTask5()
    {
        int testerAssignment;
        int counterAssignment = 0;
        System.out.println();
        System.out.println("----------------- Task 5 -----------------");
        System.out.println("Papers that their assignments weigh higher than 50.0%:");

        for (int i = 1; i < NUM_PAPERS; i++)
        {
            testerAssignment = Papers[i].getAssignments();

            if (testerAssignment > 50)
            {
                System.out.println("Paper -  " + Papers[i].getNumber() + " " + Papers[i].getName());
                counterAssignment++;
            }
        }
        System.out.println("Total number of papers that have assignments weighted more than 50%: " + counterAssignment);
    }

    public void displayTask6()
    {
        System.out.println();
        System.out.println("----------------- Task 6 -----------------");
        System.out.println("Paper offering details:");
        for (int i = 1; i < NUM_PAPERS; i++)
        {
            DistancePapers[i].displayCodeLecturerOffering();
            AucklandPapers[i].displayCodeLecturerOffering();
            PalmerstonPapers[i].displayCodeLecturerOffering();
        }
    }

    public void displayTask7()
    {
        System.out.println();
        System.out.println("----------------- Task 7 -----------------");
        System.out.println("The paper offerings that I teach:");
        int AucklandCounter = 0;
        int DistanceCounter = 0;
        for (int i = 1; i < NUM_PAPERS; i++)
        {
            if (AucklandPapers[i].getPapersThatITeach("Marcel Cantin-Gilmore")) {
                AucklandCounter++;
                AucklandPapers[i].printMyPapers();
            }
            if (DistancePapers[i].getPapersThatITeach("Marcel Cantin-Gilmore")) {
                DistanceCounter++;
                DistancePapers[i].printMyPapers();
            }
//            DistancePapers[i].displayCodeLecturerOffering();
//            AucklandPapers[i].displayCodeLecturerOffering();
//            PalmerstonPapers[i].displayCodeLecturerOffering();
        }
        int TotalCounter = AucklandCounter + DistanceCounter;

        System.out.println("I am teaching " + TotalCounter + " paper(s)");
    }
    public void displayTask8()
    {
        String Task8Lecturer = AucklandPapers[5].getLecturer();
        System.out.println();
        System.out.println("----------------- Task 8 -----------------");
        System.out.println("The lecturer of Auckland Offering of 159234:");
        System.out.println("Lecturer's Name: " + Task8Lecturer);
        int AucklandCounter = 0;
        int DistanceCounter = 0;
        for (int i = 1; i < NUM_PAPERS; i++)
        {
            if (AucklandPapers[i].getPapersThatITeach(Task8Lecturer)) {
                AucklandCounter++;
            }
            if (DistancePapers[i].getPapersThatITeach(Task8Lecturer)) {
                DistanceCounter++;
            }
        }
        int TotalCounter = AucklandCounter + DistanceCounter;

        System.out.println("This lecturer is teaching " + TotalCounter + " paper(s)");
    }

}
