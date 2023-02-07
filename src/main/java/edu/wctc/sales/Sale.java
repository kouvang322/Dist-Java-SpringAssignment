package edu.wctc.sales;

public class Sale {
    private String name;
    private String country;
    private double saleAmount;
    private double tax;
    private double shippingCost;

    // sale amount & tax should be changed to int

    public Sale(String name, String country, double saleAmount, double tax){
        this.name = name;
        this.country = country;
        this.saleAmount = saleAmount;
        this.tax = tax;
    }

    public String getName(){
        return name;
    }

    public String getCountry(){
        return country;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public double getTax() {
        return tax;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String toString(){
        return String.format("%15s %15s %15.2f %15.2f %15.2f", name, country, saleAmount, tax, shippingCost);
    }
}

