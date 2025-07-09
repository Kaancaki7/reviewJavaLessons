import java.util.Scanner;

public class temperatureConverter {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("convert to celcius or fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

       //(condition) ? true : false;
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.2f° %s",newTemp,unit);

        scanner.close();
    }
}
