package com.example.StoreProductManagementSystem.model;

public class Product {
	 
    private String proNo;
    private String proName;
    private double price;
    private int quantity;
 
    public Product() {
 
    }
 
    public Product(String proNo, String proName, double price, int quantity) {
        this.proNo = proNo;
        this.proName = proName;
        this.price = price;
        this.quantity=quantity;
    }
 
    public String getProNo() {
        return proNo;
    }
 
    public void setProNo(String proNo) {
        this.proNo = proNo;
    }
 
    public String getProName() {
        return proName;
    }
 
    public void setProName(String proName) {
        this.proName = proName;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
}