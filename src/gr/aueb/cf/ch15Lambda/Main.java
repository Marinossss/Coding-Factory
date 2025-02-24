package gr.aueb.cf.ch15Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1,"Laptop",1000, 50),
                new Product(2,"Smartphone", 500, 20),
                new Product(3, "mouse", 40, 100),
                new Product(4, "Stereo", 90, 37)
        );


        System.out.println("Initial list of products: ");
        products.forEach(System.out::println);


        System.out.println("\nProducts filtered by price >= 100 and quantity >= 40:");
        List<Product> filteredByPriceAndQuantity = Product.getFilteredProducts(products,
                p -> p.getPrice() >= 100 && p.getQuantity() >= 40);
        filteredByPriceAndQuantity.forEach(System.out::println);


        System.out.println("\nProducts sorted by price: ");
        List<Product> sortedByPrice = products.stream()
                .sorted(Comparator.comparingInt(Product::getPrice).reversed())
                .collect(Collectors.toList());
        sortedByPrice.forEach(System.out::println);






    }
}
