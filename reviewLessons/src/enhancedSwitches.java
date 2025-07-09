import java.util.Scanner;

public class enhancedSwitches {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the day of week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday" -> System.out.println("it is a weekday");
            case "Tuesday" -> System.out.println("it is a weekday");
            case "Wednesday" -> System.out.println("it is a weekday");
            case "Thursday" -> System.out.println("it is a weekday");
            case "Friday" -> System.out.println("it is a weekday");
            case "Saturday" -> System.out.println("it is a weekend");
            case "Sunday" -> System.out.println("it is a weekend");


            //hepsi aynı çıktıyı verdiği için şöyle de yapılabilir.
            /*
            case "Monday" , "Tuesday" , "Wednesday", "Thursday" , "Friday" -> System.out.println("it is a weekday");
            case "Saturday", "Sunday" -> System.out.println("it is a weekend");
            default -> System.out.println(day + "it is not a day");
             */

        }

        scanner.close();
    }
}
