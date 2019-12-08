package JavaStep2;

import java.util.Scanner;

public class Task2_CompareWith30 {
    public static void main(String[] args) {
        Scanner numIn = new Scanner(System.in);
        double[] arr = new double[3];
        String rezultatas;

        System.out.println("Iveskite pirmaji skaiciu: ");
        arr[0] = numIn.nextDouble();
        System.out.println("Iveskite antraji skaiciu: ");
        arr[1] = numIn.nextDouble();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < 30) {
                rezultatas = "mazesnis uz ";
            } else if (arr[i] > 30) {
                rezultatas = "didesnis uz ";
            } else {
                rezultatas = "lygus ";
            }
            System.out.println("Ivestas skaicius " + arr[i] +" yra " + rezultatas + "30");
        }
    }
}
