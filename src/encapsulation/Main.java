package encapsulation;

public class Main {
    public static void main(String[] args) {
//        Encapsulation is another fundamental concept in object-oriented programming.
//        It refers to the bundling of related fields and methods within one class and
//        controlling their access. Essentially, encapsulation hides the internal state
//        of an object and protects it from being directly accessed or modified from outside the class.
//
//        In Java, encapsulation can be achieved by:
//
//        Declining variables as private to limit direct access to the variable.
//                Providing public getter and setter methods (also known as accessors and mutators)
//                to modify and view the variables' values.
        Car car = new Car("Chevi","Camaro",2020);

        System.out.println(car.getMake());
        car.setYear(2023);
        System.out.println(car.getYear());

    }
}
