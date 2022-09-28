package controller;

import model.*;
import repository.*;
import services.UserService;
import services.impl.UserSeviceImpl;

import java.util.List;
import java.util.Scanner;

public class UserController {

    public static User myUser;
    private Scanner in = new Scanner(System.in);
    
    public void checkUser() {
        boolean exit = false;
        while (true) {
            System.out.println("""

                    ======'Online Market' ga xush kelibsiz.=====
                    """);
            System.out.println("1. Ro`yxatdan o`tish");
            System.out.println("2. Hisobga kirish ");
            System.out.println("0. Chiqish");
            in = new Scanner(System.in);
            int select = in.nextInt();
            switch (select) {
                case 1 -> signIn();
                case 2 -> logIn();
                default -> System.exit(0);
            }
            
        }
    }

    private void logIn() {
        in = new Scanner(System.in);
        System.out.println("Email addresingizni kiriting: ");
        String emailAdd = in.nextLine();
        System.out.println("Parolingizni kiriting: ");
        String pass = in.nextLine();

        Role role = checkRole(emailAdd, pass);
        if (role == null){
            System.out.println("Bu foydalanuvchi topilmadi.");
        }
        else if(role.getName().equalsIgnoreCase("Customer")){
            myUser = UserRepository.getUserByEmailPassword(emailAdd, pass);
            UserRepository.setMyUser(myUser);
            ShopController shopController = new ShopController();
            shopController.startControl(myUser);
        }
        else if (role.getName().equalsIgnoreCase("Salesman")){
            SalesmanController salesmanController = new SalesmanController();
            salesmanController.salesmanMenu();
        }
        else if (role.getName().equalsIgnoreCase("Manager")){

        }
        else if (role.getName().equalsIgnoreCase("Admin")){

        }
    }

    private void signIn() {
        in = new Scanner(System.in);
        
        System.out.println("Ismingizni kiriting: ");
        String userName = in.nextLine();
        System.out.println("Email addressingizni kiriting: ");
        String emailAdd = in.nextLine();
        System.out.println("Parolingizni kiriting: ");
        String pass = in.nextLine();
        Role role = RoleRepository.getRoleById(1L);
        System.out.println("To`liq addressingizni kiriting: ");
        System.out.println("Davlat: ");
        String country = in.nextLine();
        System.out.println("Viloyat: ");
        String region = in.nextLine();
        System.out.println("Shahar: ");
        String district = in.nextLine();
        System.out.println("Ko`cha: ");
        String street = in.nextLine();
        System.out.println("Uy: ");
        String home = in.nextLine();

        Address address = setAddress(country, region, district, street, home);

        UserService userService = new UserSeviceImpl();
        userService.newUser(userName, emailAdd, pass, role, address);

    }

    private Address setAddress(String country, String region, String district, String street, String home) {
        Country country1 = new Country((long)CountryRepository.countries.size(), country);
        Region region1 = new Region((long)RegionRepository.regions.size(), region, country1);
        District district1 = new District((long) DistrictRepository.districts.size(), district, region1);

        return new Address((long)AddressRepository.addresses.size(), home, street, district1);

    }

    private Role checkRole(String emailAdd, String pass) {
        List<User> userList = UserRepository.users;
        for (User user : userList) {
            if (user.getEmail().equalsIgnoreCase(emailAdd)&&user.getPassword().equalsIgnoreCase(pass)){
                myUser = user;
                return user.getRole();
            }
        }
        return null;
    }
}
