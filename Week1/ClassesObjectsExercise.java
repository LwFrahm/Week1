import java.util.*;

public class ClassesObjectsExercise {

    String colorSuit;
    String vehicle;
    String name;
    int age;
    String favoriteAnimal;
    int BadGuys;
    public ClassesObjectsExercise(String colorSuit, String vehicle, String name, int age, String favoriteAnimal) {
        this.colorSuit = colorSuit;
        this.vehicle = vehicle;
        this.name = name;
        this.age = age;
        this.favoriteAnimal = favoriteAnimal;
    }

    public ClassesObjectsExercise(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void numberBatsInCave() {
        System.out.println("The amount of bats in the cave are uncountable! There are at least 1000.");
    }

    public int NumberOfBadGuys(int BadGuys) {
        this.BadGuys = BadGuys;
        System.out.println("Total number of bad guys defeated this year is " + BadGuys+ " bad guys");
        return BadGuys;
    }

    public void BatmansNumberOneEnemy() {
        System.out.println("Batman's nemesis is the Joker");
    }

    @Override
    public String toString() {
        String value = "";
        value += "Batman's suit color is: " + colorSuit;
        value += "\nBatman's vehicle is called the: " + vehicle;
        value += "\nBatman's name is: " + name;
        value += "\nBatman's age is: " + age;
        value += "\nBatman's favorite animal is: " + favoriteAnimal;
        System.out.println(value);
        return value;
    }

    public static void main(String[] args) {
        ClassesObjectsExercise Batman = new ClassesObjectsExercise("Black", "Batmobile",
                "Bruce Wayne", 30, "Bat");
        ClassesObjectsExercise Batman2 = new ClassesObjectsExercise("Bruce", 30);
        Batman.toString();
        System.out.println();
        Batman.BatmansNumberOneEnemy();
        System.out.println();
        Batman.NumberOfBadGuys(30);
        System.out.println();
        Batman.numberBatsInCave();
        System.out.println();
        System.out.println("This is the second object: " + Batman2.name + " " + Batman2.age);
    }
}
