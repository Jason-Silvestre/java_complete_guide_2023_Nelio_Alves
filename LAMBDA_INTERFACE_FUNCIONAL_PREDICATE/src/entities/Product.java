package entities;

import java.util.Objects;

public class Product {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    //metodo estatico (trabalha com o Product que for passado como argumento)
    public static boolean staticProductPredicate(Product p) {
        return  p.getPrice() >= 100.0;
    }

    //metodo nao estatico é o metodo da instancia //acessa o atributo diretamente
    public boolean nosStaticProductPredicate() {
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return name  + ", " + String.format("%.2f", price);
    }

}