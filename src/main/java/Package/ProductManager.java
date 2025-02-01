package Package;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class ProductManager {
    private List<Product> products;

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public void sortProductsByPriceAscending() {
        Comparator<Product> priceAscending = Comparator.comparingDouble(Product::getPrice);
        Collections.sort(products, priceAscending);
        printAllProducts();
    }

    public void sortProductsByPriceDescending() {
        Comparator<Product> priceDescending = (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice());
        Collections.sort(products, priceDescending);
        printAllProducts();
    }

    public void printInStockProducts() {
        Consumer<Product> printInStock = product -> {
            if (product.isInStock()) {
                System.out.println(product);
            }
        };
        for (Product product : products) {
            printInStock.accept(product);
        }
    }

    public void filterAndPrintDeskProducts() {
        Predicate<Product> isDeskProduct = product -> product.getName().contains("Desk");
        for (Product product : products) {
            if (isDeskProduct.test(product)) {
                System.out.println(product);
            }
        }
    }

    public void getAndPrintCheapestProduct() {
        Supplier<Product> cheapestProductSupplier = () -> {
            Product cheapest = products.get(0);
            for (Product product : products) {
                if (product.getPrice() < cheapest.getPrice()) {
                    cheapest = product;
                }
            }
            return cheapest;
        };
        System.out.println("Cheapest Product: " + cheapestProductSupplier.get());
    }

    public void sortProductsByRatingDescending() {
        Comparator<Product> ratingDescending = (p1, p2) -> Double.compare(p2.getRating(), p1.getRating());
        Collections.sort(products, ratingDescending);
        printAllProducts();
    }

    public void printAllProducts() {
        Runnable printAll = () -> {
            for (Product product : products) {
                System.out.println(product);
            }
        };
        printAll.run();
    }
}