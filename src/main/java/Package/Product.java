package Package;


class Product implements Comparable<Product> {
    private String name;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;

    public Product(String name, String category, double price, double rating, boolean inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("Product{name='%s', category='%s', price=%.2f, rating=%.1f, inStock=%b}",
                name, category, price, rating, inStock);
    }

}