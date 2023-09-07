import java.util.Scanner;
import java.text.NumberFormat;

public class calculator {
    public static void main(String[] args)
    {
        final byte Months_In_Year = 12;
        final byte Percent = 100;

        Scanner scan = new Scanner(System.in);
        System.out.println("Principle:");
        int principle = scan.nextInt();

        System.out.println("Annual Interest Rate:");
        float annualInterest = scan.nextFloat();
        float monthlyInterest = annualInterest/Percent/Months_In_Year;

        System.out.println("Period(Yeaars):");
        byte years = scan.nextByte();
        int numberOfPayments = years * Months_In_Year;

        double mortage = principle
                *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                /Math.pow(1 + monthlyInterest, numberOfPayments)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortgage:" + mortgageFormatted);
    }

}

