package com.company;

public class AucklandPaper {
    private int code;
    private String Lecturer;
    private final String Offering = "Auckland";

    public AucklandPaper(int code) {
        setCode(code);
        Randomizer assignLecturer = new Randomizer();
        setLecturer(assignLecturer.getRandomAuckland());
    }
    public void displayCodeLecturerOffering()
    {
        System.out.println(getCode() + "  " + getOffering() + "  " + getLecturer());
    }

    public boolean getPapersThatITeach(String tester)
    {

        return tester.equals(getLecturer());
    }



    public void printMyPapers()
    {
        System.out.println("Paper Offering -  " + getCode() + "   Auckland   Lecturer: " + getLecturer());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLecturer() {
        return Lecturer;
    }

    public void setLecturer(String lecturer) {
        Lecturer = lecturer;
    }

    public String getOffering() {
        return Offering;
    }
}
