package za.ac.cput.Question_3.PrincipleOfLeastKnowledge.NotViolated;

public class Employee {

    String name;
    String surname;
    long employeeID;
    String employeePhoneNum;
    Job job;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeePhoneNum(String employeePhoneNum) {
        this.employeePhoneNum = employeePhoneNum;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getEmployeeID() {
        return employeeID;
    }

    public String getEmployeePhoneNum() {
        return employeePhoneNum;
    }
}
