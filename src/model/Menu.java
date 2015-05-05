/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author undeed
 */
public class Menu {

    private String name;
    private double price;
    private double tax;
    private boolean paid;

    public Menu() {
        paid = false;
    }

    public Menu(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        paid = false;
        this.tax = tax;
    }

    public double getPriceTax() {
        return price + (price * tax / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Menu{" + "name=" + name + ", price=" + price + ", tax=" + tax + ", paid=" + paid + '}';
    }

}
