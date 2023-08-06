package copyObj;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Chevy","Camaro",2020);
        Car car2 = new Car("BMW","X3",2022);
        car1.copy(car2);
        System.out.println(car1.getMake());
    }


}
