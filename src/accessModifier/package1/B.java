package accessModifier.package1;
import accessModifier.package2.*;

public class B {

    private String privateMessage = "This is a private message";
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.protectedMessage);
    }
}
