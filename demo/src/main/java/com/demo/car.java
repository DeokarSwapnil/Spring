
package com.demo;

public class car {
	private String brand;
    private double cost;
 
    public void start() {
        System.out.println("Car is running from Spring BRAND= " + brand + " and COST=" + cost);
    }
 
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public double getCost() {
        return cost;
    }
 
    public void setCost(double cost) {
        this.cost = cost;
    }
}
