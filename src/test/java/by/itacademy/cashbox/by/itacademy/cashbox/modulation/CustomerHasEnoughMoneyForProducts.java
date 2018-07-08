package by.itacademy.cashbox.by.itacademy.cashbox.modulation;

import by.itacademy.cashbox.domain.Customer;
import by.itacademy.cashbox.domain.Shop;
import by.itacademy.cashbox.domain.products.Product;
import by.itacademy.cashbox.modulation.ModulationCustomer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 08.07.2018.
 */
public class CustomerHasEnoughMoneyForProducts {
    @Test
    public void customerHasEnoughMoneyForProducts()

    {
        Shop shop = new Shop();
        ModulationCustomer modulationCustomer = new ModulationCustomer(shop);
        modulationCustomer.start();
        for (Customer customer : shop.getCustomers()) {
            int summ = 0;
            for (Product products : customer.getProducts()) {
                summ += products.getPrice();
            }
            Assert.assertTrue(customer.getMoney() - summ > 0.000000001);
        }
    }
}
