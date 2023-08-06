import  java.util.Scanner;
public class mathClasses {
    public static void main(String[] args) {
        double x = 2.14;
        double y = -10;

        System.out.println(Math.round(x));
        System.out.println(Math.floor(x));

        System.out.println(Math.ceil(x));
        System.out.println(Math.abs(y));
        System.out.println(Math.sqrt(x));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        double b = scanner.nextDouble();
        double z = Math.sqrt ((a*a) + (b*b));
        System.out.println(a);
        System.out.println(b);
        System.out.println(z);
        scanner.close();
//        double z = Math.sqrt( x**2 );
    }
}
