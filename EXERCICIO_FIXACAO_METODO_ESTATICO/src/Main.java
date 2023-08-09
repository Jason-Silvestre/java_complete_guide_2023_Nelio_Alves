import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();


        System.out.println("How many dollars will be bought? ");
        CurrencyConverter.dollarBought = sc.nextDouble();

        CurrencyConverter.reaisPaid = CurrencyConverter.currencyConverter();

        System.out.printf("What is the dollar price? %.2f%n", CurrencyConverter.dollarPrice);
        System.out.printf("How many dollars will be bought ? %.2f%n ", CurrencyConverter.dollarBought);
        System.out.printf("Amount to be paid in reais %.2f%n ", CurrencyConverter.iof() + CurrencyConverter.reaisPaid);

        sc.close();

    }
}