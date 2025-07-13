import java.util.Scanner;

public class searchAnArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1,9,2,8,3,5,4};
        String[] fruits = {"apple","orange","banana"};

        System.out.print("enter a fruit to search for: ");
        String target1 = scanner.nextLine();
        int target = 8;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        //String bir dizi için yapalım bulma işlemin
        for(int k = 0; k < fruits.length; k++){
            if(target1.equals(fruits[k])){
                System.out.println("Fruit found at index: " + k);
                break;
            }
        }

        if(!isFound){
            System.out.println("element not found in the array.");
        }



        scanner.close();
    }

}
