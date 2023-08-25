package application;

import entities.Client;

public class Main {

    public static void main(String[] args) {

//  Equals é lento mas 100% assertivo, Hashcode é r[apido mas pode falhar
//  Se o hashcode de 2 objetos gerados forem diferentes eles não são iguais.
//  É possivel ocorrer falha e 2 objetos mesmo sendo diferentes
//  possuirem o mesmo hashcode mas é dificil de acontecer

//        Exemplo 1
//        String a = "Maria";
//        String b = "Alex";
//        System.out.println("Equals:");
//        System.out.println(a.equals(b));
//        System.out.println("--------------------");
//        System.out.println("Hashcode:");
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test"; //tratamento especial ao ser comparado dessa forma retona true
        String s2 = "Test";

        String s3 = new String("Test");//não há tatamento especial nesse caso pois é alocado em memoria
        String s4 = new String("Test");//retorna false

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println("-------------------------------------");
        System.out.println(c1.equals(c2)); //compara pelo conteudo
        System.out.println(c1 == c2); //compara referencias de memória, alocados no hip em posições de memoria diferentes
        System.out.println("-------------------------------------");
        System.out.println("comparação com tratamento especial que retorna true: ");
        System.out.println(s1 == s2);
        System.out.println("-------------------------------------");
        System.out.println("comparação sem tratamento especial que retorna false: ");
        System.out.println(s3 == s4);

    }
}