package JavaStep2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner productIn = new Scanner(System.in);

        System.out.println("Would you like to buy bottle of milk or wine? Please, enter the whole word: ");

        String product = productIn.nextLine();

        switch (product) {
            case "milk":
                double milkPrice = 1.5;
                System.out.println("You wanted " + product + ". It cost " + milkPrice + " Please, enter you amount money:");
                double clientMoney = productIn.nextDouble();
                if (clientMoney < milkPrice) {
                    System.out.println("Its not enough, sorry!");
                } else {
                    System.out.println("Thank you for your purchase. Here is you change: " + (clientMoney - milkPrice));
                }
                break;
            case "wine":
                System.out.println("You wanted " + product);
                break;
            default:
                System.out.println("You wanted nothing?");
        }
    }
}
