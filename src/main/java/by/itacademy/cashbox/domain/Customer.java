package by.itacademy.cashbox.domain;

import by.itacademy.cashbox.domain.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private double money;
    private List<Product> products = new ArrayList<>();

    public Customer(double money) {
        this.money = money;
    }

    public void add(Product product) {
        products.add(product);
    }

    public void add(Product productOne, Product productTwo, Product productThree) {
        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);
    }

    public double getMoney() {
        return money;
    }

    public boolean minus(double price) {
        if (this.money >= price) {
            this.money -= price;
            return true;
        } else return false;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Customer{" + "money=" + money + ", products=" + products + '}';
    }
}
