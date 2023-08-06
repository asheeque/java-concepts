package superKeyword;

public class Person {

    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        String myString = this.name + " " + this.age + "\n";
        return myString;
    }


}
