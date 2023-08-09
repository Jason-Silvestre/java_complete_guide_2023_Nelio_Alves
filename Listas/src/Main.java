import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        //insert
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //adicionar na posição 2
        list.add(2, "Marco");

        //tamanho da lista
        System.out.println(list.size());


        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("-----------------------------");
        //remover da lista
//        list.remove("Anna");
//        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String nomes : list) {
            System.out.println(nomes);
        }

        System.out.println("-------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("quando no encontra o elemento fica com -1");

        System.out.println("-------------------------");

        //filtrar na lista somente quem tem o nome com A
        //converto para stream para trabalhar com lambda
        List<String> result = list.stream()
                //operação lambda
                .filter(x -> x.charAt(0) == 'A')
                //volto para lista
                .collect(Collectors.toList());

        for (String nomes : result) {
            System.out.println(nomes);
        }

        System.out.println("-------------------------");
        //encontrar elemento da lista que tenha a letra a
        System.out.println("encontrar primeiro elemento da lista que tenha a letra a");
        String name = list.stream()
                .filter(x -> x.charAt(0) == 'A')
                .findFirst().orElse(null);
        System.out.println(name);

    }
}