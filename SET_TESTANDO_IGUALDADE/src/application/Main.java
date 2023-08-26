package appication;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Se hashCode e equals estiverem implementados: ");
        System.out.println("O hashCode se der igual, usa equals para confirmar");
        System.out.println("String,Integer,Double e etc... ja possuem equals e hashCode");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Se hashCode e equal não estiverem implementados: ");
        System.out.println("Compara as referencias (ponteiros) dos objetos");
        System.out.println("-------------------------------------------------------------");


        Set<Product> set = new HashSet<>(); // A classe product não contem implem,entação do hashCode equals
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);//utiliza ponteiros para comparar se um produto é igual a outro

        System.out.println("por serem instancias diferentes, se na classe Product nao houver \n" +
                "implementação do hashcode e equals o resultado será : false");
        System.out.println("Se houver implementação de hashCode e equals na classe Product o resultado é: true");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Resultado da comparação no Set: ");
        System.out.println(set.contains(prod));

    }
}