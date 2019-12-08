package JavaStep3.Task1_GloceryShoping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GloceryShopingMain {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            productList.add(builtProduct());
        }

        if (makePayment(totalPrice(productList))){
            System.out.println("Shopping completed");
        } else {
            System.out.println("Shopping not completed");
        }
    }

    public static boolean makePayment(double price){
        System.out.println("Your products cost in total: " + price + ". Please, enter your amount money:");
        Scanner moneyIn = new Scanner(System.in);
        boolean shoppingResult = true;
        double clientMoney = moneyIn.nextDouble();
        if (clientMoney < price) {
            System.out.println("Its not enough, sorry!");
            shoppingResult = false;
        } else {
            System.out.println("Thank you for your purchase. Here is you change: " + (clientMoney - price));
        }
        return shoppingResult;
    }

public static double totalPrice(List<Product> productList){
        double totalPrice = 0;
        for (Product iPrice : productList){
            totalPrice = totalPrice + iPrice.getPrice();
        }
        return totalPrice;
}

    public static Product builtProduct() {
        Scanner nameIn = new Scanner(System.in);
        System.out.println("Iveskite produkto pavadinima: ");
        String productName = nameIn.nextLine();
        System.out.println("Iveskite produkto kaina: ");
        double productPrice = nameIn.nextDouble();

        return new Product(productName, productPrice);
    }
}
