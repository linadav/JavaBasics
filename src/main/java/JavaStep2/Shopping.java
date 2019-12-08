package JavaStep2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner productIn = new Scanner(System.in);

        System.out.println("Would you like to buy bottle of milk or wine? Please, enter the whole word: ");

        String product = productIn.nextLine();
        double productPrice = 0;
        if (product.equals("milk")) {
            productPrice = 1.5;
        } else if (product.equals("wine")) {
            productPrice = 0;
            System.out.println("How old are you? Please, enter your age:");
            double age = productIn.nextDouble();
            if (age > 21) {
                productPrice = 15;
            } else {
                System.out.println("You wanted " + product + ", but you are too young. Sorry! ");
            }
        } else {
            productPrice = 0;
            System.out.println("Sorry, we don't have it!");
        }

        if (productPrice != 0) {
            System.out.println("You wanted " + product + ". It costs " + productPrice + ". Please, enter your amount money:");
            double clientMoney = productIn.nextDouble();
            if (clientMoney < productPrice) {
                System.out.println("Its not enough, sorry!");
            } else {
                System.out.println("Thank you for your purchase. Here is you change: " + (clientMoney - productPrice));
            }
        }
    }
}