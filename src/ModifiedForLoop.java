import java.util.ArrayList;

public class ModifiedForLoop {

    public static void main(String args[]){

//        String[] array = {"Cat","Dog","Zebra"};
        ArrayList<String> array= new ArrayList<String>();
        array.add("Cat");
        array.add("Cat");
        array.add("Cat");
        for(String i:array){
            System.out.println(i);
        }
    }
}
