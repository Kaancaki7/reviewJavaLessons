public class Cat extends Animal {

    int lives = 9;

    void speak() {
        System.out.println("the cat goes *meow*");
    }

    @Override
    void move() {
        System.out.println("this animal is walking");
    }
}