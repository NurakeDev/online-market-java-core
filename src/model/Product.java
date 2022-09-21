package model;

public class Product {

    private final Long id;
    private String name;
    private Measurement measurement;
    private Category category;

    public Product(Long id, String name, Measurement measurement, Category category) {
        this.id = id;
        this.name = name;
        this.measurement = measurement;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'';
    }
}
