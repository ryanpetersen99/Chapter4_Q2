package za.ac.cput.Question_3.OpenClosedPrinciple;

public class Violated {

    //Open/Closed Principle Violated
    public class Circle{
        public double radius;
    }
    public class Square{
        double length;
    }

    public class Calculate{
        public double Circumference(Circle circle) {
            return Math.PI * 2 *  circle.radius;
        }
        public double Area(Square square) {
            return square.length * square.length;
        }
    }
}
