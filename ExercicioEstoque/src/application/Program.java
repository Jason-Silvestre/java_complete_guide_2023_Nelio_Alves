package application;

import entities.Product;

import javax.sound.midi.Soundbank;
import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice());

//      System.out.println(product.name + ", " + product.price + product.quantity);
//      System.out.println(product.toString());//tbm pode ser escrito sem o to string e ele ja entende é implicito

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        sc.close();
    }
}
