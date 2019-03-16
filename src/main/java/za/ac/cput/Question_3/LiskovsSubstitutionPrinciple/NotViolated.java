package za.ac.cput.Question_3.LiskovsSubstitutionPrinciple;

public class NotViolated {

    //Liskov's Substitution Principle not violated
    public class CarSpeed {
        public void Speed() {
            System.out.println("The car is driving slow");
        }
    }
    public class Fast extends CarSpeed {
        public void Speed() {
            System.out.println("The car is driving fast");
        }
    }

}
