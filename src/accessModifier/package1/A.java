package accessModifier.package1;
import accessModifier.package2.*;
public class A {

//    Public: The public keyword means the class, method, or
//      field is accessible from anywhere, including classes in different packages.
//    Protected: The protected keyword means the method or field is accessible within its own class, its own package
//      and subclasses (including subclasses in different packages).
//      It cannot be applied to classes and interfaces.
//    Default (Package-Private): If no access modifier is specified,
//      then it's considered "package-private" or "default" access.
//      The class, method, or field is accessible within its own class
//      and any other classes in the same package, but not from classes in different packages.
//    Private: The private keyword means the method or field is only accessible within its own class.
//      It cannot be applied to classes and interfaces.
    protected String protectedMessage = "This is protected";
//    public static void main(String[] args) {
//
//        B b = new B();
//        System.out.println();
//    }
}
