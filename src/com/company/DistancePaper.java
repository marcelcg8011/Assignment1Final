package com.company;

public class DistancePaper {
    private int code;
    private String Lecturer;
    private final String Offering = "Distance";

    public DistancePaper(int code) {
        setCode(code);
        Randomizer assignLecturer = new Randomizer();
        setLecturer(assignLecturer.getRandomDistance());
    }
    public void displayCodeLecturerOffering()
    {
        System.out.println(getCode() + "  " + getOffering() + "  " + getLecturer());
    }

    public boolean getPapersThatITeach(String tester)
    {

        return tester.equals(getLecturer());
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
    public void printMyPapers()
    {
        System.out.println("Paper Offering -  " + getCode() + "   Distance   Lecturer: " + getLecturer());
    }
}
