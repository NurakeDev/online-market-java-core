package services;

import model.District;

public interface AddressService {
    void newAddress(String home, String street, District district);
}
