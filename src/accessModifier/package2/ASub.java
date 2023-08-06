package accessModifier.package2;

import accessModifier.package1.*;

public class ASub extends A {

    public static void main(String[] args) {
            ASub aSub = new ASub();
            System.out.println(aSub.protectedMessage +"hi");
    }
}
