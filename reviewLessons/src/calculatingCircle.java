import java.util.Scanner;

public class calculatingCircle {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //circumference = 2 * Math.PI * radius
        //area = Math.PI * Math.pow(radius, 2)
        //volume = (4 / 3) * Math.PI * Math.pow(radius , 3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius, 2);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("CIRCUMFERENCE : %.1f\n", circumference);
        System.out.printf("AREA : %.1f\n", area);
        System.out.printf("VOLUME : %.1f\n", volume);


        scanner.close();
    }
}
