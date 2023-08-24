package application;

import services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Se utilizar o tipo Object temos problemas com o type safety
        //O object aceita todos os tipos, da problema de performance
        //usaria muito boxing e unboxing nas conversões
        //por isso usamos generics com o tipo <T> que garante reuso e type safety
        //Generics permite parametrizar o tipo com o beneficio do reuso,type safety e performance

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Hom many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        sc.close();

    }
}