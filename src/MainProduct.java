import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainProduct {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop",120,"Useful thing", new ArrayList<>(Arrays.asList(Category.ELECTRONICS)));
        Product product2 = new Product("Shirt",120,"Some desc", new ArrayList<>(Arrays.asList(Category.CLOTHES)));
        Product product3 = new Product("Nail",120,"Sharp one", new ArrayList<>(Arrays.asList(Category.DYI)));

        List<Category> categories = product1.getCategories();
        categories.set(0,Category.CLOTHES);
        System.out.println(product1);

        // will print gategories as ELECTRONICS, not CLOTHES
    }
}
