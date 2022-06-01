import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private final String name;
    private final int price;
    private final String description;
    private final List<Category> categories;

    public Product(String name, int price, String description, List<Category> categories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.categories = new ArrayList<>(categories);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name) && Objects.equals(description, product.description) && Objects.equals(categories, product.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, categories);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", categories=" + categories +
                '}';
    }
}

enum Category{
    ELECTRONICS,
    CLOTHES,
    FOOD,
    DYI
}
