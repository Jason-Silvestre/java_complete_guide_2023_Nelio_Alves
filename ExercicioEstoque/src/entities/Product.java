package entities;

public class Product {

//    public String name;
//    public double price;
//    public int quantity;

    //encapsulamento usa-se private
    // os valores do quantity ficam protegidos
    // só alteram quando entrar ou sair algo, sem acesso para alterar diretamente+
    //usando apenas get
     String name;
    private double price;
    private int quantity;

    //construtor padrão
    public Product() {
    }


    //construtor pernsonalizado
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //construtor com sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double totalValueInStock() {
       return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }
}
