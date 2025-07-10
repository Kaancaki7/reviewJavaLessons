import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attemps = 0;
        int randomNumber = random.nextInt(1,11);

        System.out.println("Number Guessing Game!");
        System.out.println("Guess a number between 1-10: ");

        do{
            System.out.print("enter a guess: ");
            guess = scanner.nextInt();
            attemps++;

            if(guess < randomNumber){
                System.out.println("too low! try again.");
            }
            else if(guess > randomNumber){
                System.out.println("too high! try again.");
            }
            else{
                System.out.println("correct! the number was " + randomNumber);
                System.out.println("# of attemps: " + attemps);
            }

        }while(guess != randomNumber);

        scanner.close();

    }


}
