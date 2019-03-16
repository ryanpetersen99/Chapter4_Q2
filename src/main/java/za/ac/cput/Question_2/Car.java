package za.ac.cput.Question_2;

/**
 * Ryan Petersen
 * 217027806
 * 3G
 * Chapter 4 Question 2
 * The alternative to inheritance used is Composition
 *
 */
public class Car
{
    int speed;
    int gears;

    public void setSpeedGears(int speed,int gears){
        this.speed = speed;
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString(){
        return "The top speed is: " + getSpeed() + "kmh" + "\n" +
                "The number of gears are: " + getGears();
    }

    public void runApp(){
        System.out.print("Car Details: " + "\n" + toString());
    }



    public static void main( String[] args )
    {
        Honda honda = new Honda();
        honda.setMethod(5,120,"Honda");
        honda.runApp();
    }
}

