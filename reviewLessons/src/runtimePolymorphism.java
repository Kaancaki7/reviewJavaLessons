import java.util.Scanner;

public class runtimePolymorphism {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Clothes clothes;

        System.out.print("would you like a tshirt or pants? (1:Tshirt - 2:Pants): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            clothes = new Tshirt();
            clothes.type();
        }
        else if(choice == 2){
            clothes = new Pants();
            clothes.type();
        }
        else {
            System.out.println("invalid choice");
        }
    }
}
