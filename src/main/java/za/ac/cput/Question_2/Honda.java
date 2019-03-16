package za.ac.cput.Question_2;

public class Honda{
    String model;
    Car c;

    public Honda(){
        this.model = "Honda";
        c = new Car();
    }

    public String getModel(){
        return model;
    }

    public void setMethod(int gears,int speed,String model){
        c.setSpeedGears(speed,gears);
        this.model = model;
    }

    public String toString(){
        return ("The car model is " + getModel() + "\n" +  c.toString());
    }

    public void runApp(){
        System.out.print("The Details Of The Car Are: " + "\n" + toString());
    }
}
