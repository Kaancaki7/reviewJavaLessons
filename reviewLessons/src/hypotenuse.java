import java.util.Scanner;

public class hypotenuse {

    public static void main(String[] args){

        //c = Math.sqrt(a^2 + b^2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("enter the length of side a: ");
        a = scanner.nextDouble();

        System.out.print("enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));

        System.out.print("C: " + c);

        scanner.close();

    }
}
