package model;

public class Order {

    private final Long id;
    private User user;
    private String date;
    private boolean status;
    private Double total_price;

    public Order(Long id, User user, String date, boolean status, Double total_price) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.status = status;
        this.total_price = total_price;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getStatus() {
        return status;
    }

    public void isStatus(boolean status) {
        this.status = status;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }
}
