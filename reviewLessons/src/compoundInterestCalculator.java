import java.util.Scanner;

public class compoundInterestCalculator {

    public static void main(String[] args){

        //A = P[1 + r/n]^nt

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("enter the number # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.println("the amount after " + years + " is: $" + amount);

        scanner.close();
    }
}
