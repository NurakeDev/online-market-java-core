package model;

public class Address {

    /**
     * BU CLASSDA USER MANZILI MALUMOTLARI JOYLASHGAN
     */

    private final Long id;
    private String home;
    private String street;
    private District district;

    public Address(Long id, String home, String street, District district) {
        this.id = id;
        this.home = home;
        this.street = street;
        this.district = district;
    }

    public Long getId() {
        return id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
