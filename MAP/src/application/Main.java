package application;

import entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");
        System.out.println(" - É uma coleção de pares chave/valor \n" +
                " - Não adimite repitições do objeto chave \n" +
                " - Os elementos são indexados pelo objeto chave \n" +
                " - não possuem posição \n" +
                " - Acesso, inserção e remoção de elementos são rápidos \n" +
                " - Uso comum: cookies, local storagem qualquer modelo chave-valor \n" +
                " - Principais implementações: HashMap - TreeMap - LinkedHashMap \n" +
                " - metodos: \n" +
                " - put(key,value),remove(key), containsKey(Key),get(Key) \n" +
                " - Se equals e hashCode não existir, é usada comparação de ponteiros: \n" +
                "   clear() size()\n" +
                " - Operações: keySet() retorna um Set<K> - values() retorna um Collection<V>");
        System.out.println("----------------------------------------------------------------");

//        tipo String ja possui equals hashCode e CompareTo nele
//        //EXEMPOLO 1
//        Map<String, String> cookies = new TreeMap<>(); //TreeMap ordena, nesse caso ordema alfabetica
//
//        cookies.put("username", "Maria");
//        cookies.put("email", "maria@gmail.com");
//        cookies.put("phone", "99711122");
//        cookies.remove("email");
//        cookies.put("phone", "99711133"); // não aceita repetições então ele sobreescreve
//
//        System.out.println("Contains 'phone' Key: " + cookies.containsKey("phone"));
//        System.out.println("Phone number: " + cookies.get("phone"));
//        System.out.println("Email: " + cookies.get("email"));  //não existe então retorna null
//        System.out.println("Size: " + cookies.size());
//
//        System.out.println("ALL COOKIES: ");
//        for (String key : cookies.keySet()) {
//            System.out.println(key + ": " + cookies.get(key));
//        }
//        System.out.println("----------------------------------------------------------------");

        Map<Product, Double> stock = new HashMap<>();
        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));



    }
}