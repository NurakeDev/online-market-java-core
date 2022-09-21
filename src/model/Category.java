package model;

public class Category {

    /**
     * BU CLASSDA MAHSULOT KATEGORIYALARI MALUMOTI JOYLASHGAN
     */

    private final Long id;
    private String name;
    private Category parent;

    public Category(Long id, String name, Category parent) {
        this.id = id;
        this.name = name;
        this.parent = parent;
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

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }


    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return   id +". "
                 + name + "\n" ;
    }
}
