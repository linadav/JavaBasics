package JavaStep1;

import java.util.Scanner;

public class DivideTwoInts {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Iveskite dalini (sveikas skaicius): ");
        double intFirst = numberScanner.nextInt();
        System.out.println("Iveskite dalinkli (sveikas skaicius): ");
        double intSecond = numberScanner.nextInt();

        if (intSecond!= 0) {
            double division = intFirst / intSecond;
            System.out.printf("Dalybos rezultatas: %.2f", division);
        } else {
            System.out.println("Daliklis negali buti lygus 0!!!");
        }

    }
}
