package edu.wctc.demo;

public class Sale {
    public String customer;
    public String country;
    public double amount;
    public double tax;
    public Sale(String customer, String country, double amount, double tax) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
    }
}
