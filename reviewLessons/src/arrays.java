import java.util.Arrays;

public class arrays {

    public static void main(String[] args){

        String[] fruits = {"apple","banana","orange","coconut"};

        int numOfFruits = fruits.length;

        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        //for döngüsünün başka bir pratik çeşidi olarakta;

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // sort metodu alfabetik sıralama yapar dizi içinde

        Arrays.sort(fruits);

        //bir dizinin içini değiştirebilirsin

        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
