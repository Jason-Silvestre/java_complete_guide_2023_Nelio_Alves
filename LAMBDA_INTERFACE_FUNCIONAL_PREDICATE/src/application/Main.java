package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------");
        System.out.println(" - Interface generics parametrizada com o tipo <T>");
        System.out.println(" - contem apenas 1 metodo abstrato chamado: test");
        System.out.println(" - o metodo recebe objeto do tipo t e retorna um boleano");
        System.out.println("-------------------------------------------------");

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //EX1
//      list.removeIf(p -> p.getPrice() >= 100);
        System.out.println("  - Method reference: metodo estatico:");
        System.out.println("EX1: list.removeIf(new ProductPredicate()); //Objeto instanciado da classe");
//      list.removeIf(new ProductPredicate()); //Objeto instanciado da classe
        System.out.println("-------------------------------------------------");

        //EX2
        System.out.println(" - Method reference: (Nome da classe + :: + nome do metodo) = Product::staticProductPredicate");
        System.out.println("EX2: list.removeIf(Product::staticProductPredicate); \n" +
                "     list.removeIf(Product::nosStaticProductPredicate);");
        list.removeIf(Product::staticProductPredicate);
        list.removeIf(Product::nosStaticProductPredicate);
        System.out.println("-------------------------------------------------");

        //EX3
        System.out.println("EX3: Predicate<Product> pred = p -> p.getPrice() >= 100.0; \n" +
                "     list.removeIf(pred);");
        System.out.println("-------------------------------------------------");

        Predicate<Product> pred = p -> p.getPrice() >= 100.0;
        list.removeIf(pred);

        //EX4
        System.out.println("EX4: double min = 100.0;\n" +
                "        list.removeIf(p -> p.getPrice() >= min);");
        System.out.println("-------------------------------------------------");

        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);


        for (Product p : list) {
            System.out.println(p);
        }


    }
}