import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double compoundInterest = principal * Math.pow(1 + (rate / 100), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);

        input.close();
    }
}

