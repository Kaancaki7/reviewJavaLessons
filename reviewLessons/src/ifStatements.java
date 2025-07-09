import java.util.Scanner;

public class ifStatements {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("enter your name: ");
        name = scanner.nextLine();

        System.out.print("enter the your age: ");
        age = scanner.nextInt();

        System.out.print("are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("you didn't enter your name. ");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(age >= 18){
            System.out.println("you are an adult.");
        }
        else if(age < 0){
            System.out.println("you haven't been born yet.");
        }
        else{
            System.out.println("you are a child.");
        }

        if(isStudent){
            System.out.println("you are a student.");
        }
        else{
            System.out.println("you are not a student.");
        }

        scanner.close();
    }
}
