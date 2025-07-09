public class printf {

    public static void main(String[] args){

        //%s --> String  %c --> char  %d --> int  %f --> double  %b --> boolean

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("your name starts with a %c", firstLetter );
        System.out.printf("your are %d years old\n", age);
        System.out.printf("you are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        System.out.println("-----------------------------------------------------------------------------------");

        //+ = output a plus
        //, = comma grouping seperators
        //( = negative numbers are enclosed in ()
        //space = display is a minus negative, space is positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        double price4 = 10000.12;

        System.out.printf("%,.2f\n", price4);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%(.2f\n", price3);
        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price3);

        System.out.println("--------------------------------------------------------------------------------------");

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        //%d nin önünde 0 eklersek ne olur

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.println("**************************");

        //%d 0 yazmadan direk sayı yazarsak 0 yerine boşluk bırakır.

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.println("**************************");

        //%d önüne negative sayı yazarsak bu sefer sağ taraftan boşluk bırakır.

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);




    }
}
