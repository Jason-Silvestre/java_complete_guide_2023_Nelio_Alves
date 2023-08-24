package application;

import java.util.Arrays;
import java.util.List;

public class Main {

//  o <Object> não é o super tipo de <List>
//  o <?> é o super tipo de <List>
//  Tipos coringa fazem métodos que recebem um genérico de qualquer tipo
// Não é possivel adicionar elementos nessas listas
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


}