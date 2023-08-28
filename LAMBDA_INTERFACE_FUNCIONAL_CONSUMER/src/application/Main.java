package application;

import entities.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------");
        System.out.println("INTERFACE FUNCIONAL PARAMETRIZADA NO TIPO <T>");
        System.out.println("Ela tem 1 unico metodo abstrato que é o accept ");
        System.out.println("O accept recebe um objeto do tipo t, executa uma ação e não retorna nada, é um void");
        System.out.println("-------------------------------------------------------");

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //EX1
        System.out.println("EX1 - list.forEach(new PriceUpdate()); //Implementação da interface \n");
//      list.forEach(new PriceUpdate()); //Um default method, que recebe um consumer como argumento, e executa um consumer na coleção pra cada elemento

        //EX2
        System.out.println("EX2 - list.forEach(Product::staticPriceUpdate); //referencia para o metodo estatico \n");
//      list.forEach(Product::staticPriceUpdate); //referencia para o metodo estatico

        //EX3
        System.out.println("EX3 - list.forEach(Product::nonStaticPriceUpdate); //referencia para o metodo nao estatico \n");
//        list.forEach(Product::nonStaticPriceUpdate); //referencia para o metodo nao estatico

        //EX4 A - com chaves
        System.out.println("EX4 A - com chaves //Expressão lambda declarada \n" +
                "       double factor = 1.1;\n" +
                "       Consumer<Product> cons = p -> {\n" +
                "       p.setPrice(p.getPrice() * factor);\n" +
                "       }; \n \n" +
                "       list.forEach(cons); \n");

//        double factor = 1.1;
//        Consumer<Product> cons = p -> {
//           p.setPrice(p.getPrice() * factor);
//        };
//        list.forEach(cons);

        //EX4 - B sem chaves, em apenas uma linha
        System.out.println("EX4 - B sem chaves, em 1 linha //Expressão lambda declarada\n" +
                "        double factor = 1.1;\n" +
                "        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor); \n" +
                "        list.forEach(cons); \n");

//        double factor = 1.1;
//        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
//        list.forEach(cons);

        //EX5 - Expressão Lambda inline
        System.out.println("EX5 - Expressão Lambda inline \n" +
                "Expressão lambda direto no argumento da função \n" +
                "        double factor = 1.1;\n" +
                "        list.forEach( p -> p.setPrice(p.getPrice() * factor)); //expressão lambda direto no argumento da função \n");

        double factor = 1.1;
        list.forEach( p -> p.setPrice(p.getPrice() * factor)); //expressão lambda direto no argumento da função


        System.out.println("-------------------------------------------------------");
        System.out.println("Resultado: ");
        list.forEach(System.out::println); //reference method para o println

    }
}