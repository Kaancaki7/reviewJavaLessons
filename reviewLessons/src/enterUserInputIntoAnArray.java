import java.util.Arrays;
import java.util.Scanner;

public class enterUserInputIntoAnArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size; //dizinin kaç elemanlı olmasını da kullanıcıdan alacağız.

        System.out.print("what # of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("enter a food: ");
            foods[i] = scanner.nextLine();
        }

        Arrays.sort(foods);
        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
