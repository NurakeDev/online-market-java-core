package model;

public class OrderDetail {
    private final Long id;
    private Order order;
    private Product product;
    private String qty;

    public OrderDetail(Long id, Order order, Product product, String qty) {
        this.id = id;
        this.order = order;
        this.product = product;
        this.qty = qty;
    }

    public Long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
