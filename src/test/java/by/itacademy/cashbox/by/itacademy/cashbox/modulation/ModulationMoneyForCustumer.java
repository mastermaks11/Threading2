package by.itacademy.cashbox.by.itacademy.cashbox.modulation;

import by.itacademy.cashbox.domain.Customer;
import by.itacademy.cashbox.domain.Shop;
import by.itacademy.cashbox.modulation.ModulationCustomer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 08.07.2018.
 */
public class ModulationMoneyForCustumer {
    @Test
    public void modulationCashBoxText()
    {
        Shop shop = new Shop();
        ModulationCustomer modulationCustomer = new ModulationCustomer(shop);
        modulationCustomer.start();
        for(Customer customer : shop.getCustomers())
        Assert.assertNotNull(customer.getMoney());
    }
}
