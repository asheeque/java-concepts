import java.util.ArrayList;
import java.util.Random;

public class arrayList2d {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Cake");
        bakeryList.add("Cheese Cake");
        bakeryList.add("Biscuits");

        ArrayList<String> foodList = new ArrayList<String>();
        foodList.add("Rice");
        foodList.add("Chicken curry");
        foodList.add("Biryani");

        arrayList.add(bakeryList);
        arrayList.add(foodList);

        for(int i =0;i<arrayList.size();i++){
            System.out.println();
            for(int j=0;j<arrayList.get(i).size();j++){
                System.out.print(arrayList.get(i).get(j) + " ");
            }
        }


    }
}
