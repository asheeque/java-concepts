package dynamicPolymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want ?  (1=Dog) (2=Cat)");
        int prompt = scanner.nextInt();
        if(prompt == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(prompt == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            animal.speak();
        }
    }
}
