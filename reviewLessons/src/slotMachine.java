import java.util.Random;
import java.util.Scanner;

public class slotMachine {

    public static void main(String[] args){

        //JAVA SLOT MACHINE

        //DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //  DISPLAY WELCOME MESSAGE
        System.out.println("*************************");
        System.out.println("WELCOME TO JAVA SLOTS!!!!");
        System.out.println("Symbols : 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("*************************");

        //PLAY IF BALANCE > 0
        while (balance > 0){
            System.out.println("Current balance: $" + balance);

            //ENTER BET AMOUNT
            //      VERIFY IF BET > BALANCE
            //      VERIFY IF BET > 0
            //      SUBSTRACT BET FROM BALANCE

            System.out.print("place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("INSUFFICIENT FUNDS!");
                continue;
            }
            else if(bet <= 0){
                System.out.println("BET MUST BE GREATER THAN 0!");
                continue;
            }
            else{
                balance -= bet;
                System.out.println("$" + balance);
            }

            //SPIN ROW
            System.out.println("Spinning...");
            row = spinRow();
            //PRINT ROW
            printRow(row);
            //GET PAYOUT
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("you won : $" + payout);
                balance += payout;
            }
            else{
                System.out.println("sorry you lost this round");
            }
            //ASK TO PLAY AGAIN
            System.out.println("Do you want to play again?(Y/N) ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }
        }

        //DISPLAY EXIT MESSAGE
        System.out.println("GAME OVER!Your final balance: " + balance);

        scanner.close();
    }

    //SPIN ROW
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    //PRINT ROW
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | " , row));
    }

    //GET PAYOUT
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[0].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };

        }
        return 0;
    }

}
