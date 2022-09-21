package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private final Long id;
    private User user;
    private IncomeProduct incomeProduct;
    private int qty;  // nechta mahsulot ekanligi

    public ShoppingCard(Long id, User user,IncomeProduct incomeProduct, int qty) {
        this.id = id;
        this.user = user;
        this.incomeProduct = incomeProduct;
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public IncomeProduct getProduct() {
        return incomeProduct;
    }

    public void setProduct(IncomeProduct incomeProduct) {
        this.incomeProduct = incomeProduct;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ShoppingCard{" +
                "incomeProduct=" + incomeProduct +
                ", qty=" + qty +
                '}';
    }
}
