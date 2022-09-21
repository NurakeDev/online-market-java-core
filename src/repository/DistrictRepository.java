package repository;

import model.District;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistrictRepository {

    public static List<District> districts = new ArrayList<>();

    public static List<District> getDistricts() {
        return districts;
    }

    public static void setDistricts(List<District> districts) {
        DistrictRepository.districts = districts;
    }

    public static void startDistricts(){

        districts = new ArrayList<>();

        Arrays.asList(
                new District(1L, "Nukus", RegionRepository.getRegionByName("Karakalpakistan")),
                new District(2L, "Boukhara", RegionRepository.getRegionByName("Boukhara")),
                new District(3L, "Urgench", RegionRepository.getRegionByName("Kharezm")),
                new District(4L, "Fergana", RegionRepository.getRegionByName("Fergana")),
                new District(3L, "Chilanzar", RegionRepository.getRegionByName("Tashkent")),
                new District(1L, "Sergeli", RegionRepository.getRegionByName("Tashkent")),
                new District(2L, "Mangit", RegionRepository.getRegionByName("Karakalpakistan")),
                new District(3L, "Shovot", RegionRepository.getRegionByName("Kharezm")),
                new District(1L, "Gurlen", RegionRepository.getRegionByName("Kharezm")),
                new District(2L, "Khozarasp", RegionRepository.getRegionByName("Kharezm")),
                new District(3L, "Turtkul", RegionRepository.getRegionByName("Kharezm")),
                new District(1L, "Kungrad", RegionRepository.getRegionByName("Karakalpakistan"))

                ).forEach(element->districts.add(element));

    }

    public static District getDistrictByName(String name){
        for (District district : districts) {
            if (district.getName().equalsIgnoreCase(name)){
                return district;
            }
        }
        return null;
    }

    public static District getDistrictById(Long id){
        for (District district : districts) {
            if (district.getId().equals(id)){
                return district;
            }
        }
        return null;
    }

}
