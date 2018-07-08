package by.itacademy.cashbox.modulation;

import by.itacademy.cashbox.domain.Shop;

/**
 * Created by user on 06.07.2018.
 */
public class ModulationShop implements Runnable {
    private Shop shop;

    public ModulationShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        ModulationСashBox modulationСashBox = new ModulationСashBox(shop);
        modulationСashBox.addCashBoxes();
        ModulationCustomer modulationCustomer = new ModulationCustomer(shop);
        modulationCustomer.start();
        System.out.println(shop.getCashBoxes());
        shop.startCashBoxes();
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
