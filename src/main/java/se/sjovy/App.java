package se.sjovy;

import se.sjovy.model.Action;
import se.sjovy.model.Conditional;
import se.sjovy.model.Product;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Shirt", 25.0, 10));
        productList.add(new Product("Pants", 35.0, 20));
        productList.add(new Product("Hat", 15.0, 30));
        productList.add(new Product("Shoes", 45.0, 40));
        productList.add(new Product("Socks", 5.0, 50));
        productList.add(new Product("Gloves", 10.0, 0));

        // Apply lambda expression to print out all Products that have stock value of 0.
        System.out.println("Products with stock value of 0:");

        // Create the actual lambda expression
        Conditional outOfStock = product -> product.getStock() == 0;

        for (Product p : productList) {
            if (outOfStock.test(p)) {
                System.out.println(p);
            }
        }

        // Apply lambda expression to print out the productName of all the Products that starts with S.
        System.out.println("Products that starts with S:");

        // Create the actual lambda expression
        Conditional startsWithS = product -> product.getProductName().startsWith("S");

        for (Product p : productList) {
            if (startsWithS.test(p)) {
                System.out.println(p.getProductName());
            }
        }

        // Apply lambda expression to print out all Products that have price above 20 AND lower than 45
        System.out.println("Products with price above 20 AND lower than 45:");

        // Create the actual lambda expression
        Conditional priceBetween20And45 = product -> product.getPrice() > 20 && product.getPrice() < 45;

        for (Product p : productList) {
            if (priceBetween20And45.test(p)) {
            System.out.println(p);
            }
        }

        // Apply lambda expression to increase the price of all Products
        // that have a stock value of less than 10 AND above 0 by 50%
        System.out.println("Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%:");

        // Create the actual lambda expression
        Action increasePrice = product -> {
            if (product.getStock() < 10 && product.getStock() > 0) {
                product.setPrice(product.getPrice() * 1.5);
            }
        };

        for (Product p : productList) {
            increasePrice.execute(p);
            System.out.println(p);
        }

    }
}