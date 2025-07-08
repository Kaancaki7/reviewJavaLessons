import java.util.Scanner;

public class userInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name : ");
        String name = scanner.nextLine();

        System.out.println("enter your age  : ");
        int age = scanner.nextInt();

        System.out.println("Are you a student(true/false) : ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("what is your gpa : ");
        double gpa = scanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("your gpa is: " + gpa);
        if(isStudent){
            System.out.println("you are a student!");
        }
        else{
            System.out.println("you are not a student!");
        }
        scanner.close();
    }
}
