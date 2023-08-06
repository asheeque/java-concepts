package objectArr;

public class Main {

    public static void main(String[] args){

//        Food[] refrigirator = new Food[3];
        Food food1 = new Food("Thenga");
        Food food2 = new Food("Manga");
        Food food3 = new Food("Pazham");
        Food[] refrigirator = {food1,food2,food3};
//        refrigirator[0] = food1;
//        refrigirator[1] = food2;
//        refrigirator[2] = food3;
        for(Food i:refrigirator){
            System.out.println(i.name);
        }

    }

}
