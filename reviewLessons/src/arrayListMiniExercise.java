import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListMiniExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("enter the number of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
