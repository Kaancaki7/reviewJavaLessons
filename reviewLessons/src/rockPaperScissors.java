import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

    public static void main(String[] args){

        //ROCK PAPER SCİSSORS GAME

        //DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            //GET CHOICE FROM THE USER
            System.out.print("Enter your move (rock,paper,scissors) : ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("invalid choice!");
                continue;
            }

            //GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            //CHECK WIN CONDITIONS
            if(playerChoice.equals(computerChoice)){
                System.out.println("it is a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("you win!");
            }
            else{
                System.out.println("you lose!");
            }

            //ASK TO PLAY AGAIN?
            System.out.print("Play again? (yes/no) : ");
            playAgain = scanner.nextLine().toLowerCase();
            System.out.println();

        }while(playAgain.equals("yes"));

        //GOODBYE MESSAGE
        System.out.println("**********");
        System.out.println("Game over!");
        System.out.println("**********");

        scanner.close();
    }
}
