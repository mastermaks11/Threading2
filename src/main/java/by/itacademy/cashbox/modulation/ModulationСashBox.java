package by.itacademy.cashbox.modulation;

import by.itacademy.cashbox.domain.CashBox;
import by.itacademy.cashbox.domain.Shop;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 06.07.2018.
 */
public class ModulationСashBox {
    private Set<CashBox> cashBoxes;
    private Shop shop;

    public ModulationСashBox(Shop shop) {
        this.cashBoxes = new HashSet<>();
        this.shop = shop;
    }

    public void addCashBoxes() {
        int countCashBoxes = (int) (Math.random() * 10);
        if (countCashBoxes != 0) {
            System.out.println("Количество касс " + countCashBoxes);
            for (int i = 1; i <= countCashBoxes; i++) {
                cashBoxes.add(new CashBox(i, shop.getCustomers()));
            }
        } else cashBoxes.add(new CashBox(1, shop.getCustomers()));
        shop.setCashBoxes(cashBoxes);
    }
}
