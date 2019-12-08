package JavaStep2;

import java.util.Scanner;

public class Task2_CompareBothWith30 {
    public static void main(String[] args) {
        Scanner numIn = new Scanner(System.in);
        double[] arr = new double[3];
        String rezultatas;

        System.out.println("Iveskite pirmaji skaiciu: ");
        arr[0] = numIn.nextDouble();
        System.out.println("Iveskite antraji skaiciu: ");
        arr[1] = numIn.nextDouble();

        arr[0] = arr[0]-30;
        arr[1] = arr[1]-30;
       // System.out.println(Double.compare(arr[0],arr[1]));
       double rez = Double.compare(arr[0],arr[1]);
        if (rez<0 ) {
                rezultatas = " mazesni uz ";
            } else if (rez > 0) {
                if (arr[1]> 0) {
                    rezultatas = " didesni uz ";
                } else {
                    rezultatas = "skirtingu lyginant su ";
                }
            } else {
                rezultatas = "lygus ";
            }
            System.out.println("Ivesti skaiciai yra " + rezultatas + "30");

    }
}
