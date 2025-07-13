import java.util.Random;
import java.util.Scanner;

public class carMain {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car = new Car();
        Car car2 = new Car();

        car.isRunning = false; //özelliklerini değiştirebiliriz

        System.out.println(car); // direkt adresini verir
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.start();
        car.stop();
        car.drive();
        car.brake();

        System.out.println(car.make + " " + car2.make);
    }
}
