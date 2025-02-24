package gr.aueb.cf.ch15Lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Product {
    private int id;
    private String title;
    private int price;
    private int quantity;

    public Product() {

    }

    public Product(int id, String title, int price, int quantity) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static List<Product> getFilteredProducts(List<Product> productList, Predicate<Product> filterCondition) {

        return productList.stream()
                .filter(filterCondition)
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
