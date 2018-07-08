package by.itacademy.cashbox.domain;

import by.itacademy.cashbox.domain.products.Product;

import java.util.Queue;

public class CashBox implements Runnable {
    private final Queue<Customer> customers;
    private int id;
    private double money;

    public CashBox(int id, Queue<Customer> customers) {
        this.id = id;
        this.customers = customers;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            waitingCheck();
            service(customer());
        }
    }

    private void service(Customer customer) {
        for (Product product : customer.getProducts()) {
            if (!customer.minus(product.getPrice())) {
                break;
            } else {
                this.money += product.getPrice();
            }
        }

        System.out.println(Thread.currentThread().getName() + " " + id + " : " + customer);
    }

    private Customer customer() {
        synchronized (customers) {
            return customers.poll();
        }
    }

    private void waitingCheck() {
        synchronized (customers) {
            try {
                while (customers.isEmpty()) customers.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "CashBox{" + "id=" + id + ", money=" + money + '}';
    }

}
