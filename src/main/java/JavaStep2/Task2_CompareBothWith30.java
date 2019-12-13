package JavaStep2;

import java.util.Scanner;

public class Task2_CompareBothWith30 {
    public static void main(String[] args) {
        Scanner numIn = new Scanner(System.in);
        double[] arr = new double[3];
        String rezultatas1;
        String rezultatas;
        int NUMBER = 30;

        System.out.println("Iveskite pirmaji skaiciu: ");
        arr[0] = numIn.nextDouble();
        System.out.println("Iveskite antraji skaiciu: ");
        arr[1] = numIn.nextDouble();

        arr[0] = arr[0] - NUMBER;
        arr[1] = arr[1] - NUMBER;
        // System.out.println(Double.compare(arr[0],arr[1]));
        double rez = Double.compare(arr[0], arr[1]);
        if (rez == 0) {
            rezultatas1 = "lygus ";
        } else {
            rezultatas1 = "nelygus ";
        }

        if (arr[0] < 0 && arr[1] > 0 || arr[0] > 0 && arr[1] < 0) {
            rezultatas = "skirtingi lyginant su ";
        } else if (arr[0] < 0 && arr[1] < 0) {
            rezultatas = " mažesni uz ";
        } else if (arr[0] > 0 && arr[1] > 0) {
            rezultatas = " didesni uz ";
        } else {
            rezultatas = "kazkuris lygus ";
        }
        System.out.println("Ivesti skaiciai yra " + rezultatas1 + " ir " + rezultatas + NUMBER);
    }
}
