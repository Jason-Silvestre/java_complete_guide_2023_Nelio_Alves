package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    //exercicio sem usar o static

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //instanciei o calculator
        //para poder utilizar sem o metodo static
        Calculator calc = new Calculator();

        System.out.printf("Enter radius: ");
        double radius = sc.nextDouble();

        double circumference = calc.circumference(radius);

        double volume = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }

}