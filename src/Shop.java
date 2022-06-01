import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {

    private final List<Product> products;

    public Shop(List<Product> products) {
        this.products = new ArrayList<>();
        for(Product product: products){
            if(!productExists(product)){
                // product does not exists, will be added
                this.products.add(product);
            }else{
                System.out.println(String.format("Product with name %s exists in shop!",product.getName()));
            }
        }
    }

    private boolean productExists(Product product) {
        return this.products.stream().filter(p -> p.getName().equals(product.getName())).count() > 0;
    }


    //add inventory product
    public void addProduct(Product product){
        if(!productExists(product)) {
            this.products.add(product);
        }
    }

    // buy products
    public String buyProducts(int amount){
        String response = String.format("You successfully purchased %s items!", amount);
        // check if we have enough in shop
        if(amount > this.getInventory()){
            response = String.format("We don't have enough items in shop. Maximum items that can be purchased is %s.", this.getInventory());
        }else{
            for (int i = 0; i < amount; i++) {
                this.products.remove(0);
            }
        }
        return response;
    }

    public int getInventory() {
        return this.products.size();
    }

//    public List<Product> getProducts() {
//        return new ArrayList<>(products);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return  Objects.equals(products, shop.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "products=" + products +
                '}';
    }
}
