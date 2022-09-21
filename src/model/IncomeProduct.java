package model;

import java.util.Date;

public class IncomeProduct {


    /**
     * BU CLASSDA MAHSULOT MALUMOTLARI BOR
     */


    private final Long id;
    private Product product;
    private String description;
    private Long price;
    private Long quantum;
    private String date;

    public IncomeProduct(Long id, Product product, String description, Long quantum, Long price, String date) {
        this.id = id;
        this.product = product;
        this.description = description;
        this.quantum = quantum;
        this.price = price;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getQuantum() {
        return quantum;
    }

    public void setQuantum(Long quantum) {
        this.quantum = quantum;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "IncomeProduct{" +
                "id=" + id +
                ", product=" + product +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantum=" + quantum +
                ", date='" + date + '\'' +
                '}';
    }
}
