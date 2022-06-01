import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainShop {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop",120,"Useful thing", new ArrayList<>(Arrays.asList(Category.ELECTRONICS)));
        Product product2 = new Product("Shirt",120,"Some desc", new ArrayList<>(Arrays.asList(Category.CLOTHES)));
        Product product3 = new Product("Nail",120,"Sharp one", new ArrayList<>(Arrays.asList(Category.DYI)));
        Product productDuplicate = new Product("Nail",120,"Sharp one", new ArrayList<>(Arrays.asList(Category.DYI)));

        Shop shop = new Shop(new ArrayList<>(Arrays.asList(product1,product2,product3, productDuplicate)));
        System.out.println("Initial Inventory:" + shop.getInventory());
        Product product4 = new Product("Burger",120,"Good Food", new ArrayList<>(Arrays.asList(Category.FOOD)));
        shop.addProduct(product4);
        System.out.println("Items after add:" + shop.getInventory());

        String message = shop.buyProducts(6);
        System.out.println(message);

        message = shop.buyProducts(3);
        System.out.println(message);
        System.out.println("Items after purchase:" +shop.getInventory());
    }
}
