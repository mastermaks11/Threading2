package by.itacademy.cashbox.domain;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Shop {
    private Queue<Customer> customers = new LinkedList<>();
    private Set<CashBox> cashBoxes = new HashSet<>();

    public void startCashBoxes() {
        for (CashBox cashBox : cashBoxes)
            cashBox.start();
    }

    public Queue<Customer> getCustomers() {
        return customers;
    }

    public Set<CashBox> getCashBoxes() {
        return cashBoxes;
    }

    public void setCashBoxes(Set<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }
}
