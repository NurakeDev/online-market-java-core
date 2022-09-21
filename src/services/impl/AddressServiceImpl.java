package services.impl;

import model.Address;
import model.District;
import repository.AddressRepository;
import services.AddressService;

public class AddressServiceImpl implements AddressService {
    @Override
    public void newAddress(String home, String street, District district) {
        AddressRepository.addresses.add(AddressRepository.addresses.size(), new Address(
                (long)AddressRepository.addresses.size(), home, street, district
        ));
    }
}
