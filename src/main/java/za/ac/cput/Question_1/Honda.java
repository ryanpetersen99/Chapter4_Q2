package za.ac.cput.Question_1;

public class Honda extends Car {

    String model;

    public Honda(int speed,int gears,String model){
        super(120,5);
        this.model = "Honda";
    }


    public int getSpeed(){
        return speed;
    }

    public String getModel() {
        return model;
    }
    public int getGears(){
        return gears;
    }

    @Override
    public String toString(){
        return ("The car model is " + getModel() + "\n" + super.toString());
    }

    public void runApp(){
        System.out.print("The Details Of The Car Are: " + "\n" + toString());
    }
}
