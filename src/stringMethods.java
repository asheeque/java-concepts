import javax.swing.*;

public class stringMethods {


    public static void main(String args[]){

        String name = "  Bro   ";

//        boolean result = name.equals("Bro");
//        boolean resultIgnore = name.equalsIgnoreCase("bro");
//
//        int len = name.length();
//        char ch = name.charAt(2);
//        int pos = name.indexOf("B");
//        boolean res = name.isEmpty();
//        String res = name.toUpperCase();
//        String res = name.toLowerCase();
//        String res = name.trim();
        String res = name.replace("B","D");
        System.out.println(res);


    }
}
