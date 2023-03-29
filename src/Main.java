import product.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter of product: ");
        product.name = sc.nextLine();
        System.out.println("Enter of value: ");
        product.price = sc.nextDouble();
        System.out.println("Enter of quantity: ");
        product.quantity = sc.nextInt();
        System.out.println(product);

        System.out.println("digite quantos produtos deseja adicionar: ");
        product.addProducts(product.quantity = sc.nextInt());
        System.out.println(product);

        System.out.println("digite quantos quer remover:");
        int quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println(product);


        sc.close();
    }
}