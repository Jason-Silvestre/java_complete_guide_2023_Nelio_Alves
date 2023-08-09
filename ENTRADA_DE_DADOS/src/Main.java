import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//-----------------------------------------------
//        Entrada de dados: Texto/String
//        Scanner sc = new Scanner(System.in);
//        String x;
//        x = sc.next();
//-----------------------------------------------
//      Entrada de dados: numeros arrendondados/Double
//        Scanner sc = new Scanner(System.in);
//        double x;
//        x = sc.nextDouble();
//        System.out.printf("Voce digitou: %.2f%n ", x);
//-----------------------------------------------
//      Entrada de dados: numeros arrendondados/Double com ponto(.)
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        double x;
//        x = sc.nextDouble();
//        System.out.printf("Voce digitou: %.2f%n ", x);
//-----------------------------------------------
//        Entrada de caracteres char
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        char x;
//        x = sc.next().charAt(0);
//        System.out.println("Voce digitou: " + x);
//-----------------------------------------------
//      Entrada de diferentes tipos de dados
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        String x;
//        int y;
//        double z;
//        x = sc.next();
//        y = sc.nextInt();
//        z = sc.nextDouble();
//        System.out.println("Dados digitados: ");
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//-----------------------------------------------
//      Entrada de dados co leitura até a quebra de linha,
//      leitura de dados até usuario inserir o enter
//        Scanner sc = new Scanner(System.in);
//        String s1, s2, s3;
//
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//
//        System.out.println("DADOS DIGITADOS:");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//-----------------------------------------------
//      Entrada de dados com quebra de linha pendente
//      qualquer comando que não seja nextLine ex: nextInt();
//        Scanner sc = new Scanner(System.in);
//        int x;
//        String s1, s2, s3;
//
//        x = sc.nextInt();
//        sc.nextLine();
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//
//        System.out.println("DADOS DIGITADOS:");
//        System.out.println(x);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
// -----------------------------------------------

//        sc.close();
// -----------------------------------------------
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}