import java.util.Scanner;

public class logicalOperators {

    public static void main(String[] args){

        // && = AND    || = OR     != NOT

        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){

            System.out.println("the weather is good");
            System.out.println("it is sunny outside");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println( "the weather is good");
            System.out.println("it is cloudy outside");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("the weather is bad");
        }

        System.out.println("---------------------------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        String userName;

        System.out.print("enter your new username: ");
        userName = scanner.nextLine();

        if(userName.length() < 4 || userName.length() > 12){
            System.out.println("username must be between 4-12 characters");
        }
        else if(userName.contains(" ") || userName.contains("_")){
            System.out.println("username must not contain spaces or underscores");
        }
        else{
            System.out.println("welcome " + userName);
        }

        scanner.close();



    }
}
