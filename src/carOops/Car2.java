package carOops;

public class Car2 {

    String make = "cheverlot";
    String model = "corvette";
    int year = 2020;
    String color = "Yellow";
    Double price = 50000.0;

    void drive(){
        System.out.println("You drive the car");

    }
    void breaks(){
        System.out.println("Break activated");
    }

    public String toString(){
        String myString = make + " " + model + " " + color + " " + year;
        return myString;
    }
}
