package JavaStep2;

import java.util.Scanner;

public class Task1_gt20 {
    public static void main (String[] args) {
        Scanner numberIn = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        String rezultatas ;
        double number = numberIn.nextDouble();
// PRIMINIMAS: return windSpeed <= 20 ? "ramus" : "striprus";

        if (number<30) {
            rezultatas = "mazesnis uz ";
        } else if (number>30) {
            rezultatas = "didesnis uz ";
        } else {
            rezultatas = "lygus ";
        }

        System.out.println("Ivestas skaicius yra " + rezultatas + "30");
    }

}
