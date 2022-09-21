import controller.UserController;
import repository.*;

public class Runnable {
    public static void main(String[] args) {
        CountryRepository.startCountries();
        RoleRepository.startRoles();
        CategoryRepository.startCategories();
        MeasurementRepository.startMeasurements();
        DistrictRepository.startDistricts();
        ProductRepository.startProducts();
        UserRepository.startUsers();
        IncomeProductRepository.startIncomeProducts();

        UserController userController = new UserController();
        userController.checkUser();

    }
}