package abstraction;

public class Main {

    public static void main(String[] args){
//Abstraction is a fundamental concept in object-oriented programming (OOP)
// that is used to hide the complexity of the system and show only the essential
// features to the user. This reduces code complexity, enhances readability, and
// hides the internal workings of the software system, which increases security.
//
//In Java, abstraction can be achieved in two ways:
//
//Abstract Classes: An abstract class in Java is a class that contains one or
// more abstract methods, which are declared but contain no implementation.
// Abstract classes cannot be instantiated; they must be inherited by other
// classes. Here's an example of an abstract class:
//        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.go();

    }
}
