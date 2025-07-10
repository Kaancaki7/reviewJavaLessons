import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class whileLoops {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("hello " + name);

        System.out.println("-----------------------------------------------------------------------------------");

        String response = "";

        while(!response.equals("Q")){
            System.out.println("you are playing a game");
            System.out.print("press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("you have quit the game.");

        System.out.println("------------------------------------------------------------------------------------");

        int age = 0;

        System.out.print("enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.println("age can't be negative");
            System.out.print("enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("you are " + age + " years old");

        System.out.println("--------------------------------------------------------------------------------------");

        //do while exercise

        int number = 0;

        do{
            System.out.print("enter a number between 1-10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("you picked " + number);

        scanner.close();
    }
}
