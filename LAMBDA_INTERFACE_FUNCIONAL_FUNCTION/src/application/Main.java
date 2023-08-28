package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        System.out.println("-------------------------------------------------------");
        System.out.println("- Interface Funcional que tem 2 parametros <T, R>");
        System.out.println(" - Ela possui o metodo apply que recebe 1 objeto do tipo T e retorna 1 R");
        System.out.println(" - A função map não é a estrutura de dados Map, são coisas diferentes");
        System.out.println(" - map é uma função que aplica uma função a todos elementos de uma stream");
        System.out.println(" - map não funciona apartir de uma lista e sim de uma stream, stream e uma sequencia de dados");
        System.out.println("-------------------------------------------------------");


        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        System.out.println(" - A função map so funciona para stream, não da para utilizar com listas então \n");
        System.out.println("1 - a Função map aplica na coleção a função entre parenteses; 2 - Converter a lista para stream; \n" +
                "3 - Converter stream para lista; 4 - Produzir uma lista fazendo a atribuição \n");
        System.out.println(" - Para converter lista para stream usa -se: \n" +
                "   .stream() \n");

        System.out.println(" - Para converter essa stream em uma lista: \n" +
                        "   list.stream().map(new UpperCaseName()) \n ");

        System.out.println(" - Para converter em lista usa -se: \n" +
                        "   .collect(collectors.toList()) \n ");

        System.out.println("   list.stream().map(new UpperCaseName()).collect(Collectors.toList()); \n");

        System.out.println(" - Agora é nescessario atribuir essa conversão para uma lista de Strings: \n" +
                "   List<String> names = \n");

        System.out.println("   List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); \n" +
                "   names.forEach(System.out::println);");
        System.out.println("-------------------------------------------------------");


        //EX1 - Implementação da interface
        System.out.println(" EX1 -  Implementação da interface \n" +
                " List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); \n");
//        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //EX2 - Reference method com metodo estatico
        System.out.println(" EX2 - Reference method com metodo estatico \n" +
                " List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); \n");
//        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //EX3 - Reference method com metodo não estatico
        System.out.println(" EX3 - Reference method com metodo não  estatico \n" +
                " List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList()); \n");
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //EX4 - Expressão Lambda declarada
        System.out.println(" EX4 - Expressão Lambda declarada \n" +
                " Function<Product, String> func = p -> p.getName().toUpperCase();\n" +
                "        List<String> names = list.stream().map(func).collect(Collectors.toList());\n" +
                "        names.forEach(System.out::println); \n");

//        Function<Product, String> func = p -> p.getName().toUpperCase();
//        List<String> names = list.stream().map(func).collect(Collectors.toList());
//        names.forEach(System.out::println);

        //EX5 - Expressão lambda inline
        System.out.println(" EX5 - Expressão lambda inline");
        System.out.println(" Expressão lambda inline, diretamente no map");
        System.out.println(" List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());");

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        System.out.println("-------------------------------------------------------");
        System.out.println("Resultado: ");
        names.forEach(System.out::println);



    }
}