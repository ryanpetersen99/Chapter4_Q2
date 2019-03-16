package za.ac.cput.Question_3.OpenClosedPrinciple;

public class NotViolated {

    //Open/Closed Principle not Violated

    public interface shapes{
        public double Calculate();
    }
    public class Circle implements shapes{
        public double radius;

        @Override
        public double Calculate() {
            return Math.PI * 2 * radius;
        }
    }
    public class Square implements shapes{
        double length;

        @Override
        public double Calculate() {
            return length * length;
        }
    }

    public class ShapeCalulator {
        public double calculateShape(shapes Shape) {
            return Shape.Calculate();
        }
    }
}
