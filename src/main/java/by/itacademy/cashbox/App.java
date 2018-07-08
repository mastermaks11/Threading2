package by.itacademy.cashbox;

import by.itacademy.cashbox.domain.Shop;
import by.itacademy.cashbox.modulation.ModulationShop;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class App {

    public static final Logger LOGGER = Logger.getLogger(App.class.getName());

    static {
        try (InputStream in = App.class.getResourceAsStream("/log.properties")) {
            LogManager.getLogManager().readConfiguration(in);
        } catch (IOException e) {
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        ModulationShop modulationShop = new ModulationShop(shop);
        try {
            modulationShop.start();
        } catch (Exception e)

        {
            LOGGER.log(Level.INFO, e.getMessage());
        }
    }
}
