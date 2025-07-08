import java.util.Scanner;

public class calculateAreaRectangle {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double area;
        double width;
        double height;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.print("The area is : " + area);

        scanner.close();
    }
}
