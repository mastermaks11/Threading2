package by.itacademy.cashbox.by.itacademy.cashbox.modulation;

import by.itacademy.cashbox.domain.Shop;
import by.itacademy.cashbox.modulation.ModulationСashBox;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 08.07.2018.
 */
public class ModulationCashBoxTest {
    @Test
    public void modulationCashBoxText()
    {
        Shop shop = new Shop();
        ModulationСashBox modulationСashBox = new ModulationСashBox(shop);
        modulationСashBox.addCashBoxes();
        Assert.assertNotNull(shop.getCashBoxes());
    }
}
