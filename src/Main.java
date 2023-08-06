import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //STATIC is used to maintain a signle copy of varibale/method for a class

//        float x = 3.19f;
//        String a = "first";
//        String b = "Second";
//        String c;
//        c = b;
//        b = a;
//        a = c;
//        System.out.println(a);
//        System.out.println(b);
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Name ?");
        String name = scanner.nextLine();
        System.out.println("Age ?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Food ?");
        String food = scanner.nextLine();

        System.out.println(name +"\n"+ age + "\n" + food);

    }
}