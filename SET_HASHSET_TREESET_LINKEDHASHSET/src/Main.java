import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Representa um conjunto de elementos similar ao da algebra");
        System.out.println("Não admite repetições");
        System.out.println("Acesso,inserção e remoção de elementos são rapidos");
        System.out.println("Operações eficientes de conjunto: interseção, união e diferença");
        System.out.println("HashSet - mais rapido (Operações O(1) em tabela hash) e não ordenado");
        System.out.println("TreeSet - mais lento (Operações O(log(n)) em arvore rubro-negra), \n" +
                "ordenado pelo compareTo do objesto (ou comparador)");
        System.out.println("velocidade intermediaria e elementos na ordem em que são adicionados");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("add(obj) remove(obj) contains(obj) baseado em equals e hashcode, \n" +
                        "não havendo equals e hashcode utiliza ponteiros na comparação,\n" +
                "clear() esvazia o conjunto. size() retorna o tamanho do conjunto. \n" +
                        "removeIf(predicate)remove quem atender o predicado.");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("addAll(other) união - adiciona elementos de outro conjunto sem repetição");
        System.out.println("retainAll(other) interseção - remove do conjunto os elementos não contidos em other");
        System.out.println("remove(other) diferença - remove do conjunto os elementos contidos em other");
        System.out.println("------------------------------------------------------------------------");

        System.out.println("HashSet: //hashset [e o mais rapido mas nao garante a ordenação");
        Set<String> hashSet = new HashSet<>(); //hashset [e o mais rapido mas nao garante a ordenação
        hashSet.add("TV");
        hashSet.add("Tablet");
        hashSet.add("Notebook");
        System.out.println(hashSet.contains("Notebook"));

        for (String h : hashSet) {
            System.out.println(h);
        }
        System.out.println("------------------------------------------------------------------------");

        System.out.println("TreeSet: //TreeSet ordena os dados V maisculo é maior que a minusculo");
        Set<String> treeSet = new TreeSet<>(); //TreeSet ordena os dados V maisculo é maior que a minusculo
        treeSet.add("TV");
        treeSet.add("Tablet");
        treeSet.add("Notebook");
        System.out.println(treeSet.contains("Notebook"));

        for (String t : treeSet) {
            System.out.println(t);
        }
        System.out.println("------------------------------------------------------------------------");

        System.out.println("LinkedHashSet: //linkedHashSet mantem a ordem que os elementos foram inseridos");
        Set<String> linkedHashSet = new LinkedHashSet<>(); //linkedHashSet mantem a ordem que os elementos foram inseridos
        linkedHashSet.add("TV");
        linkedHashSet.add("Tablet");
        linkedHashSet.add("Notebook");
        System.out.println(linkedHashSet.contains("Notebook"));

        for (String lhs : linkedHashSet) {
            System.out.println(lhs);
        }
        System.out.println("------------------------------------------------------------------------");

        System.out.println("LinkedHashSet: remove() and removeIf()");
        Set<String> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add("TV1");
        linkedHashSet2.add("Tablet1");
        linkedHashSet2.add("Notebook1");
        linkedHashSet2.add("TV2");
        linkedHashSet2.add("Tablet2");
        linkedHashSet2.add("Notebook2");
        linkedHashSet2.add("TV3");
        linkedHashSet2.add("Tablet3");
        linkedHashSet2.add("Notebook4");
        System.out.println(linkedHashSet2.contains("Notebook"));

        linkedHashSet2.remove("Tablet2");
        linkedHashSet2.removeIf(x -> x.length() >= 8);
        linkedHashSet2.removeIf(x -> x.charAt(2) == '2');


        for (String lhs2 : linkedHashSet2) {
            System.out.println(lhs2);
        }
        System.out.println("------------------------------------------------------------------------");

        System.out.println();

        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        System.out.println("union: criando terceiro conjunto passando outro conjunto como argumento(a)");
        Set<Integer> c = new TreeSet<>(a); //c é a copia do conjunto a
        c.addAll(b); //uniao do conjunto c com o conjunto b
        System.out.println(c);
        System.out.println("------------------------------------------------------------------------");

        System.out.println("intersection: somente os elemementos em comm entre os conjuntos");
        Set<Integer> d = new TreeSet<>(a); //instanciação do conjunto d como copia do conjunto a
        d.retainAll(b);//
        System.out.println(d);
        System.out.println("------------------------------------------------------------------------");

        System.out.println("difference: remover do conjunto e todos que estão no conjunto a");
        Set<Integer> e = new TreeSet<>(a); //conjunto e é a copia do conjunto a
        e.removeAll(b); //remover do conjunto e todos que estão no conjunto a
        System.out.println(e);

    }
}