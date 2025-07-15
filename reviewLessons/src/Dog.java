public class Dog extends Animal{

    int lives = 1;

    void speak(){
        System.out.println("the dog goes *woof*");
    }

    @Override
    void move(){
        System.out.println("this animal is walking");
    }
}
