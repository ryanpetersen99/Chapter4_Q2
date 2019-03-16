package za.ac.cput.Question_1;

/**
 * Ryan Petersen
 * 217027806
 * 3G
 * Chapter 4 Question 1
 *
 */
public class Car
{
    int speed;
    int gears;

    public Car(int speed, int gears){
        this.gears = gears;
        this.speed = speed;
    }

    public String toString(){
        return "The top speed is: " + speed + "kmh" + "\n" +
                "The number of gears are: " + gears;
    }

    public void runApp(){
        System.out.print("Car Details: " + "\n" + toString());
    }

    public static void main( String[] args )
    {
        Car car = new Honda(0,0,"");
        car.runApp();
    }
}

