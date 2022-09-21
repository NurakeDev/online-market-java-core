package repository;

import model.Address;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressRepository {

    public static List<Address> addresses = new ArrayList<>();

    public static List<Address> getAddresses() {
        return addresses;
    }

    public static void setAddresses(List<Address> addresses) {
        AddressRepository.addresses = addresses;
    }

    public static void startAddresses(){
        addresses = new ArrayList<>();
        Arrays.asList(
                new Address(1L, "24-uy", "Charag`on ko`chasi",
                        DistrictRepository.getDistrictByName("Mangit")),
                new Address(2L, "125-uy", "Obod mahallasi",
                        DistrictRepository.getDistrictByName("Gurlen")),
                new Address(3L, "7-dom, 65-xonadon", "Nurafshon",
                        DistrictRepository.getDistrictByName("Chilanzar")),
                new Address(4L, "34-uy", "Guliston",
                        DistrictRepository.getDistrictByName("Gurlen")),
                new Address(5L, "4-dom, 12-xonadon", "Ozbekistan koshesi",
                        DistrictRepository.getDistrictByName("Nukus"))

        ).forEach(element -> addresses.add(element));
    }

    public static Address getAddressById(Long id){
        for (Address address : addresses) {
            if (address.getId().equals(id)){
                return address;
            }
        }
        return null;
    }
}
