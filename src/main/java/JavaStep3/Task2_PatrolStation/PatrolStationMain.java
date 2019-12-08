package JavaStep3.Task2_PatrolStation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatrolStationMain {
    public static void main(String[] args) {
        List<Gas> gasList = new ArrayList<>();
        Scanner answerIn = new Scanner(System.in);
        boolean pirkimas = true;
        while (pirkimas) {
            gasList.add(builtPurchase());
            System.out.println("Ar pirksite dar? t/n");
            String answer = answerIn.nextLine();
            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                pirkimas = false;
            }
        }
        makePayment(totalPrice(gasList));

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
    public static double totalPrice(List<Gas> gasList){
        double totalPrice = 0;
        for (Gas iPrice : gasList){
            totalPrice = totalPrice + iPrice.getGasType().getPrice()*iPrice.getAmount();
        }
        return totalPrice;
    }
    public static Gas builtPurchase() {
        Scanner nameIn = new Scanner(System.in);
        System.out.println("Iveskite kuro pavadinima: Diesel/Gas99/Gas95/Gas");
        String productName = nameIn.nextLine();
        System.out.println("Iveskite kuro kieki: ");
        int productAmount = nameIn.nextInt();

        return new Gas(EnumGasTypePrice.valueOf(productName), productAmount);
    }
}
