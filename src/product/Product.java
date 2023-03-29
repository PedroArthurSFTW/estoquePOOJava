package product;

/**
 * @Product: classe que recebera as informações dos produtos
 */
public class Product {
    public String name;
    public Double price;
    public int quantity;

    /**
     *
     * @return: calculo do valor do estoque multiplicando o preço pela qualidade
     */
    public double totalValueStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return "data: " + name
                + ", $" + price
                + ", " + quantity + " units"
                + ", total: $" + totalValueStock();
    }
}
