package Package;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", "Electronics", 1200, 4.5, true));
        productList.add(new Product("Smartphone", "Electronics", 800, 4.7, true));
        productList.add(new Product("T-Shirt", "Clothing", 20, 4.2, true));
        productList.add(new Product("Blender", "Appliances", 50, 3.8, false));
        productList.add(new Product("Desk", "Furniture", 150, 4.0, true));
        productList.add(new Product("Chair", "Furniture", 75, 3.9, true));

        ProductManager manager = new ProductManager(productList);

        System.out.println("Sort by price (ascending):");
        manager.sortProductsByPriceAscending();

        System.out.println("\nSort by price (descending):");
        manager.sortProductsByPriceDescending();

        System.out.println("\nProducts in stock:");
        manager.printInStockProducts();

        System.out.println("\nFilter products containing 'Desk':");
        manager.filterAndPrintDeskProducts();

        System.out.println("\nFind and print the cheapest product:");
        manager.getAndPrintCheapestProduct();

        System.out.println("\nSort by rating (descending):");
        manager.sortProductsByRatingDescending();

        System.out.println("\nPrint all products:");
        manager.printAllProducts();
    }
}










