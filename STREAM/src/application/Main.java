package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println(" - É uma sequencia de elementos advinda de uma fonte de dados que oferece \n" +
                " suporte a operações agregadas. Fonte de dados: \n " +
                "(colecao; array; funcao de iteracao; recurso de E/S) \n");

        System.out.println(" - Declarativa (iteracao interna: escondida do programador \n" +
                " - Parallel-friendly (imutavel -> thread safe (paralelizado de forma segura \n" +
                " - Sem efeitos coleterais \n" +
                " - Sob demanda (lazy evaluation \n");

        System.out.println(" - Acesso sequencial(nao ha indices) \n" +
                " - Single-use: só pode ser usada uma vez \n");

        System.out.println(" - Pipeline (linha de montagem): operacoes em streams retornam novas streams \n" +
                "  - Sendo possivel criar uma cadeia de operacoes (fluxo de processamento) \n" +
                "  - Pipeline tem 0 ou + operacoes intermadiarias \n" +
                "  - Operacao intermediaria produz novas streams e apenas 1 operacao terminal (lazy evaluation)\n" +
                "  - Operacao terminal produz um objeto nao-stream(colecao ou outro) e determina fim do processamento);");

        System.out.println("  - Operacoes intermediarias: \n" +
                "    filter; map; flatmap; peek; distinct; sorted; skip; limit(*) limit é short-circuit");

        System.out.println("  - Operacoes terminais: \n" +
                "    forEach,forEachOrdered; toArray; reduce; collect; collect; min; max; count; anyMatch(*) \n " +
                "   allMatch(*); noneMatch(*); findFist(*),  findAny(*) * = short-circuit (quando condicao satisfeita, para processamento)");
        System.out.println("-----------------------------------------");


        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

//        Stream<Integer> st1 = list.stream();
//        System.out.println(Arrays.toString(st1.toArray()));

        //"Criar uma Stream apartir de uma colecao: ");
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println("st1: ");
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println("-----------------------------------------");

        //criar uma Stream usando stream.of
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println("st2: ");
        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println("-----------------------------------------");


        //Stream com Funcao de iteracao
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // stream infinita
        System.out.println(" - Operacao intermediaria retorna uma nova stream, a nova stream chamo o to.Array para imprimir o vetor");
        System.out.println(" System.out.println(Arrays.toString(st3.limit(10).toArray()));");
        System.out.println("st3: ");
        System.out.println(Arrays.toString(st3.limit(10).toArray()));//limit para em 10 elementos,transformo em vetor no to.Array
        System.out.println("-----------------------------------------");

        //sequencia de fibonacci
        Stream<Long> st4 =  Stream.iterate(new Long[] {0L, 1L},
                 p -> new Long[] {p[1], p[0]+p[1]})
                .map(p -> p[0]);
        System.out.println("st4: ");
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }
}