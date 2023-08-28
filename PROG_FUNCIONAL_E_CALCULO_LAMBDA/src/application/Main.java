package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    //exemplo 1
    public static int globalValue = 3;

//    exemplo 2
    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------");
        System.out.println("Pradigmas da programação: \n" +
                " - Imperativo; orientado a objeto; funciona; lógico e multiparadigma");
        System.out.println(" - Java < 8 = Orientado a Objeto");
        System.out.println(" - Java =>8 = Multiparadigma && Jasvascript = Multiparadigma");
        System.out.println(" - Transparencia referencial = se seu resultado for sempre o mesmo \n" +
                "   para os mesmos dados de entrada. Beneficios: simplicidade e previsibilidade)");
        System.out.println(" - Prog imperativa (transparencia referencial) fraca. - Prog funcional (transparencia referencial) forte");
        System.out.println("-------------------------------------------------------");


        System.out.println("exemplo 1: Prog imperativa (transparencia referencial) fraca");
        System.out.println("-------------------------------------------------------");
        int[] vect = new int[] { 3, 4, 5 };
        changeOddValues(vect); //o comportamento dessa função,não depende exclusivamente do que esta na função,depende de valor externo.
        System.out.println(Arrays.toString(vect));
    }
    //Por essa função depender de valor externo, ela não tem transparencia referencial
    public static void changeOddValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i ++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }

        System.out.println("Exemplo 2: Objetos de primeira ordem na prog imperativa");
        System.out.println(" - Funções não são Objetos de primeira ordem na prog imperativa.");
        System.out.println(" - Funções são Objetos são de primeira ordem na prog funcional.");
        System.out.println("-------------------------------------------------------");

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        list.sort(Main::compareProducts);//Passar uma função como argumento de outra função = Objeto de primeira classe ou primeira ordem
        list.forEach(System.out::println);

        System.out.println("-------------------------------------------------------");
        System.out.println(" - Passar uma função como argumento de outra função = A função é um objeto de primeira classe ou primeira ordem \n" +
                "e pode ser retornado por uma função");

        System.out.println("-------------------------------------------------------");
        System.out.println("exemplo 3: A Prog imperativa tem baixa expressividade e a Prog funcional tem alta exprecividade e código conciso.");

        System.out.println();
        System.out.println("Programação Imperativa: ");
        System.out.println(" Integer sum = 0;\n" +
                "        for (Integer x : list) {\n" +
                "            sum += x;\n" +
                "        }");

        System.out.println();
        System.out.println("Programação Funcional: ");
        System.out.println("Integer sum = list.stream().reduce(0, Integer::sum);");
        System.out.println("-------------------------------------------------------");

        System.out.println("Exemplo 4: Tipagem dinamica / inferencia de tipos ");
        System.out.println(" - O compilador deduz que p1 e p2 são do tipo Product, não precisou declarar tipo da variaveis");
        System.out.println("list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));");
        System.out.println();

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("O que são expressões Lambda ?");
        System.out.println(" - Em Programação Funcional a Expressão Lambda corresponde a uma função anonima de primeira classe");
        System.out.println(" - Função que não foi declarada, não tem nome e ela é de primeira classe,pode ser passada como argumento");
        System.out.println(" - Ela define os parametros e depois o que a função retorna: ");
        System.out.println("list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));");
        System.out.println("-------------------------------------------------------");

    }

}