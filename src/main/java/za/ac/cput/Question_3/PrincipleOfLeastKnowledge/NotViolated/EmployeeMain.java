package za.ac.cput.Question_3.PrincipleOfLeastKnowledge.NotViolated;

public class EmployeeMain {

    //Principle Of Least Knowledge not violated

    public static void main(String[] args) {


        Employee emp = new Employee();
        Job job = new Job();

        emp.setName("Ryan");
        emp.setSurname("Petersen");
        emp.setEmployeeID(11234);
        emp.setEmployeePhoneNum("05412345678");
        job.setJob("IT Technician");
        job.setDepartment("I.T");
        emp.setJob(job);
    }

        public static String EmployeeDetails(Employee employee){
        String employeeDetails = employee.getName();
            return "Job: " + employeeDetails;
        }
    }

