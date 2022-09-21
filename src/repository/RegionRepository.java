package repository;

import model.Region;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegionRepository {

    public static List<Region> regions = new ArrayList<>();

    public static List<Region> getRegions() {
        return regions;
    }

    public static void setRegions(List<Region> regions) {
        RegionRepository.regions = regions;
    }

    public static void startRegions(){
        regions = new ArrayList<>();

        Arrays.asList(

                new Region(1L, "Karakalpakistan", CountryRepository.countries.get(0)),
                new Region(2L, "Tashkent", CountryRepository.countries.get(0)),
                new Region(3L, "Fergana", CountryRepository.countries.get(0)),
                new Region(4L, "Boukhara", CountryRepository.countries.get(0)),
                new Region(5L, "Kharezm", CountryRepository.countries.get(0)),
                new Region(6L, "Nur-Sultan", CountryRepository.countries.get(1)),
                new Region(7L, "Almaty", CountryRepository.countries.get(1)),
                new Region(8L, "Moscow", CountryRepository.countries.get(2)),
                new Region(9L, "Sochi", CountryRepository.countries.get(2)),
                new Region(10L, "Shanghai", CountryRepository.countries.get(3)),
                new Region(11L, "Pekin", CountryRepository.countries.get(3)),
                new Region(12L, "Bishkek", CountryRepository.countries.get(4)),
                new Region(13L, "Osh", CountryRepository.countries.get(4))

                ).forEach(region -> regions.add(region));

    }

    public static Region getRegionByName(String name){
        for (Region region : regions) {
            if (region.getName().equalsIgnoreCase(name)){
                return region;
            }
        }
        return null;
    }


}
