package za.ac.cput.Question_3.LiskovsSubstitutionPrinciple;

public class Violated {

    //Liskov's Substitution Principle violated
    public class Car {
        public void ShiftGear() {
            System.out.println("Gear shifted to first");
        }
    }
    public class Stall extends Car {
        public void ShiftGear() {
            throw new RuntimeException("Gear shifted to second");
        }
    }
}
