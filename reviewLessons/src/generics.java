import java.util.ArrayList;

public class generics {

    public static void main(String[] args) {


        //generics = a concept where you can write a class, interface or method
        //           that is compatible with different data types
        //           <T> type parameter (placeholder that gets replaced with a real type)
        //           <String> type argument (specifies the type)


        //Box<T> sınıfımızın içine istediğin türü yazıp ekleme yapabilirsin string ekleyeceksen string yapıyosun
        //integer ekleyeceksen integer yapıyosun
        Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());

        //**********************************************************************************************************

        Product<String, Double> product = new Product<>("apple",5.99);
        Product<String, Integer> product2 = new Product<>("apple",3);

        System.out.println(product.getItem() + ": $" + product.getPrice());
        System.out.println(product2.getItem() + ": $" + product2.getPrice());



    }
}
