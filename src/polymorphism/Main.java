package polymorphism;

public class Main {

    public static void main(String[] args) {
        //The ability of an object to identify as more than one type
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        Vehicle[] racers = {car,bicycle,boat};
        for(Vehicle x:racers){
            x.go();
        }
    }
}
