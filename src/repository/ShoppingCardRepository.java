package repository;

import model.ShoppingCard;
import model.User;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCardRepository {

    public static List<ShoppingCard> shoppingCardList = new ArrayList<>();

    public static void showMyShoppingCart(User user){

        System.out.println(shoppingCardList.size() == 0?"Savatcha bo`sh":shoppingCardList);
    }

    public static ShoppingCard getMyShoppingCard(User user){
        for (ShoppingCard shoppingCard : shoppingCardList) {
            if (shoppingCard.getUser().getId().equals(user.getId())){
                return shoppingCard;
            }

        }
        return null;
    }


}
