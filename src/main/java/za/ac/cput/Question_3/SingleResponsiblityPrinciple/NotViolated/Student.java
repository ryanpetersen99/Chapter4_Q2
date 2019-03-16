package za.ac.cput.Question_3.SingleResponsiblityPrinciple.NotViolated;

public class Student {

    //Single Responsibility not Violated
    private String studentName;
    private String studentSurname;
    private long studentNumber;
    private String studentCourse;



    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public String getStudentCourse() {
        return studentCourse;
    }
}
