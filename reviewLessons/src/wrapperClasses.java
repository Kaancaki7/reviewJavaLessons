public class wrapperClasses {

    public static void main(String[] args){

        //wrapper class'lar sayesinde birsürü method kullanabiliyoruz. Integer, Double, Char, Boolean dan.

        //Autoboxing
        Integer a = 12;
        Double b = 3.14;
        Character c = 'a';
        Boolean d = true;

        //unboxing
        int x = a;
        double y = b;
        char z = c;
        boolean w = d;

        //hepsini string tarzında yazdı
        System.out.println("******************************");

        String m = Integer.toString(12);
        String n = Double.toString(3.14);
        String k = Character.toString('@');
        String j = Boolean.toString(false);

        String s = m + n + k + j;
        System.out.println(s);

        System.out.println("******************************");

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter)); //büyük harf olup olmadığını kontrol ediyo
    }
}
