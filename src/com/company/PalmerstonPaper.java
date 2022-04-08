package com.company;

public class PalmerstonPaper {
    private int code;
    private String Lecturer;
    private final String Offering = "Palmerston";

    public PalmerstonPaper(int code) {
        setCode(code);
        Randomizer assignLecturer = new Randomizer();
        setLecturer(assignLecturer.getRandomPalmerston());

    }
    public boolean getPapersThatITeach(String tester)
    {

        return tester.equals(getLecturer());
    }

    public void displayCodeLecturerOffering()
    {
        System.out.println(getCode() + "  " + getOffering() + "  " + getLecturer());
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
