/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Product {
    

    // Private properties - Encapsulation
    private String productId;
    private String productName;
    private String category;
    private double price;
    private int quantity;

    // Constructor
    public Product(String productId, String productName, String category,
                   double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate Inventory Value
    public double calculateInventoryValue() {
        return price * quantity;
    }

    // Get Stock Status
    public String getStockStatus() {
        if (quantity == 0) {
            return "Out of Stock";
        } else if (quantity >= 1 && quantity <= 10) {
            return "Low Stock";
        } else if (quantity >= 11 && quantity <= 50) {
            return "Normal Stock";
        } else {
            return "High Stock";
        }
    }

    // Display Product Information
    public void displayProductInfo() {
        System.out.println("===== PRODUCT INFORMATION =====");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.printf("Price: ₱%,.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Inventory Value: ₱%,.2f%n", calculateInventoryValue());
        System.out.println("Stock Status: " + getStockStatus());
    }

   
}



