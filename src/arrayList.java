import javax.swing.*;
import java.util.ArrayList;

public class arrayList {

    public static void main(String args[]){


        ArrayList<String> food = new ArrayList<String>();

        food.add("Burger");
        food.add("Pizza");
        food.add("hotDog");
        food.set(1,"sushi");
//        food.remove(1);
//        food.clear();
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
