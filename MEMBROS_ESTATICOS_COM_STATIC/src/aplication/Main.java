package aplication;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    //exercicio sem usar o static

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter radius: ");
        double radius = sc.nextDouble();

        //nao precisou instanciar o calculator
        //Podemos chamar direto a classe e utilizar o metodo estatico
        //A terceira solução é utilizar static no metodo e na classe calculator
        double circumference = Calculator.circumference(radius);

        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }

}