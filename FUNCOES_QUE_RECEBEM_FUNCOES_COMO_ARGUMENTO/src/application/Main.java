package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------");
        System.out.println(" - removeIf(Predicate) \n " +
                " - foreach(Consumer \n " +
                " - map(Function");
        System.out.println("----------------------------------");

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv" , 900.00));
        list.add(new Product("Mouse" , 50.00));
        list.add(new Product("Tablet" , 350.00));
        list.add(new Product("HD Case" , 80.90));

        ProductService ps = new ProductService();

//      double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));



    }
}