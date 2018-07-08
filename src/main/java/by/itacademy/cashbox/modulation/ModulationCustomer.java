package by.itacademy.cashbox.modulation;

import by.itacademy.cashbox.domain.Customer;
import by.itacademy.cashbox.domain.Shop;
import by.itacademy.cashbox.domain.products.Bread;
import by.itacademy.cashbox.domain.products.Milk;
import by.itacademy.cashbox.domain.products.Sugar;

/**
 * Created by user on 06.07.2018.
 */
public class ModulationCustomer implements Runnable {
    private Shop shop;

    public ModulationCustomer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        int countCustomers = (int) (Math.random() * 10);
        System.out.println("количетво покупателей " + countCustomers);
        if (countCustomers != 0) for (int i = 0; i < countCustomers; i++) {
            shop.getCustomers().add((new Customer(Math.random() * 10)));
        }
        if (countCustomers != 0) for (Customer customer : shop.getCustomers()) {
            if (customer.getMoney() < 4) customer.add(new Milk());
            else {
                customer.add(new Milk(), new Sugar(), new Bread());
            }
        }
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
