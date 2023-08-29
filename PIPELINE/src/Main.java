import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.asList(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y); //reduce é operacao terminal
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()       //gerou uma stream
                .filter(x -> x % 2 == 0)            //com base no predicado gera uma nova stream //filtrei os elementos pares
                .map(x -> x * 10)                   //gerou uma nova stream, a original * 10
                .collect(Collectors.toList());      //operacao terminal,transformando a stream em uma lista
        System.out.println(Arrays.toString(newList.toArray()));
    }
}