package se.sjovy.model;

public class Product {
    private String productName;
    private double price;
    private int stock;

    //Getters and setters

    // Constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double v) {
        this.price = v;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }


}
