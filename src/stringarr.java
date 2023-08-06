import java.util.Random;

public class stringarr {

    public static void main(String[] args) {

        String[] cars = {"BMW","BENZ"};
        String[] cars2 = new String[2];
        cars2[0] = "BMW";
        cars2[1] = "Tesla";

        for(int i =0;i< cars.length;i++){
            System.out.println(cars[i]);
        }

        for(int i =0;i< cars2.length;i++){
            System.out.println(cars2[i]);
        }

        //2d array
        String[][] cars2d = new String[2][2];
        cars2d[0][0] = "Bmw";
        cars2d[0][1] = "Benz";
        cars2d[1][0] = "Silverado";
        cars2d[1][1] = "Ford";
        for(int i =0;i< cars2d.length;i++){
            System.out.println();
            for(int j =0;j< cars2d[i].length;j++){
                System.out.print(cars2d[i][j] + " ");
            }
        }




    }
}
