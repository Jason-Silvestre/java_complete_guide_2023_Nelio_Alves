package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 400.0));

        System.out.println("-----------------------------------------------------------");
        System.out.println("Comparator de classe separada,chamando outra classe onde esta o comparator e a implementação \n" +
                "uma das formas de usar comparator no metodo sort: \n \n" +
                "list.sort(new MyComparator()); \n \n" +
                "  for (Product p : list) { +\n" +
                "  System.out.println(p);\n" +
                "}");
        //list.sort(new MyComparator());
        System.out.println("-----------------------------------------------------------");


        System.out.println("uma das formas de usar comparator no metodo sort");
        System.out.println("Comparator objeto de classe anonima :");
        System.out.println("-----------------------------------------------------------");
        System.out.println("sem utilizar lambda:");
        System.out.println();
        System.out.println("Comparator<Product> comp = new Comparator<Product>() {\n" +
                "@Override\n" +
                "public int compare(Product p1, Product p2) {\n" +
                " return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());\n" +
                " }\n" +
                " };\n" +
                " list.sort(comp)\n \n" +

                " for (Product p : list) {\n" +
                "  System.out.println(p);\n" +
                " } \n ");
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };
//        list.sort(comp);
//
//            for (Product p : list) {
//               System.out.println(p);
//        }
        System.out.println("-----------------------------------------------------------");


        System.out.println();
        System.out.println("Utilizando lambda exemplo 1- Comparator objeto de experrsão lambda com chaves :");
        System.out.println();
        System.out.println(" Comparator<Product> comp = (p1, p2) -> {\n" +
                "return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());\n" +
                "};\n" +
                "list.sort(comp);\n \n" +

                " for (Product p : list) {\n" +
                "  System.out.println(p);\n" +
                "} \n");

        //Arrow function -> 2 argumentos + {implementação da função}
//        Comparator<Product> comp = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };
//        list.sort(comp);
//
//        for (Product p : list) {
//            System.out.println(p);
//        }

        System.out.println("-----------------------------------------------------------");

        System.out.println("Utilizando lambda em 1 linha, exemplo 2 - Comparator objeto de expressão lambda sem chaves :");
        System.out.println();
        System.out.println("Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());\n" +
                "\n" +
                "list.sort(comp);\n" +
                "\n" +
                "for (Product p : list) {\n" +
                " System.out.println(p);\n" +
                "} \n \n" +
                "Resultado da impressão: ");

//        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//
//        list.sort(comp);
//
//        for (Product p : list) {
//            System.out.println(p);
//        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Utilizando lambda em 1 linha, exemplo 3 - Comparator expressão lambda direto no argumento: ");
        System.out.println("Expressão lambda diretamente como argumento do sort");
        System.out.println();
        System.out.println("list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));\n" +
                "\n" +
                "        for (Product p : list) {\n" +
                "            System.out.println(p);\n" +
                "        } \n \n " +
                "-----------------------------------------------------------\n" +
                "Resultado da impressão: \n");


        //expressão lambda diretamente como argumento do sort
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }


    }
}