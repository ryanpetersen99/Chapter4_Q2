package za.ac.cput.Question_3.InterfaceSegregationPrinciple;

public class Violated {

    //Interface segregation principle violated
    public interface ButtonPressedCheck{
        String ButtonPressed = "Button was pressed";
    }
    public interface ButtonHeldCheck{
        String ButtonHeld = "Button was held";
    }
}
