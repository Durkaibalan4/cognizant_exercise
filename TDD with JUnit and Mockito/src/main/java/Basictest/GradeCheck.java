package Basictest;

public class GradeCheck {
    public boolean isPassed(int marks) {
        return marks >= 40;
    }

    public String calculateGrade(int marks) {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 40)
            return "C";
        else
            return "F";
    }
}
