package application;

import entities.Product;

import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Ao utilizar treeSet a classe do conjunto precisa ser uma implementação do comparable");
        System.out.println("Para que seja possivel que o treeset ordene seus objetos ");
        System.out.println("------------------------------------------------------------------------------------");

        set.add(new Product("TV", 900.0));
        set.add(new Product("NoteBook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        for (Product p : set) {
            System.out.println(p);
        }
    }
}