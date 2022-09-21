package repository;

import model.Country;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryRepository {
    public static List<Country> countries = new ArrayList<>();

    public static List<Country> getCountries() {
        return countries;
    }

    public static void setCountries(List<Country> countries) {
        CountryRepository.countries = countries;
    }

    public static void startCountries(){
        countries = new ArrayList<>();

        Arrays.asList(
                new Country(1L, "Uzbekistan"),
                new Country(2L, "Kazakhstan"),
                new Country(3L, "Russia"),
                new Country(4L, "China"),
                new Country(5L, "Kirgizistan"
                )).forEach(country -> countries.add(country));

    }

    public static Country findCountryByid(Long id){
        for (Country country : countries) {
            if (country.getId() == id){
                return country;
            }
        }
        return null;
    }

}
