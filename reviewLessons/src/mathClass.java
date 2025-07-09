public class mathClass {

    public static void main(String[] args){

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;

        result = Math.pow(2, 3);  //üst alma
        result = Math.abs(-5);  //mutlak değer
        result = Math.sqrt(9); //karekök
        result = Math.round(3.49);  //yuvarlama
        result = Math.ceil(3.1);  //her zaman tavan değere yuvarlar.
        result = Math.floor(3.7);  //her zaman taban değere yuvarlar
        result = Math.max(10, 20);   //max değeri bulur
        result = Math.min(10, 20);  //min değeri bulur

        System.out.println(result);
    }
}
