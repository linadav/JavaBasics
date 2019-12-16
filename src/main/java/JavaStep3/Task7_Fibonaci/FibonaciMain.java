package JavaStep3.Task7_Fibonaci;

import java.util.Scanner;

public class FibonaciMain {
    public static void main(String[] args) {
        //4. Fibonači seka:
        //Parašyti programą kuri, įrašius sekos numerį, išvestų rezultatą į ekraną;
        //Naudoti rekursyvią funkciją.

        Scanner input = new Scanner(System.in);
        System.out.println("Kuri Fibonaci sekos nari isvesti?  Iveskite sekos nario indeksa: ");
        int num = input.nextInt();

        System.out.println("Fibonaci sekos " + num + " narys yra " + getFibonaci(num));

    }

    public static int getFibonaci(int num) {
        int[] numArr = new int[1000];
        numArr[0] = 0;
        numArr[1] = 1;
        if (num > 1) {
            for (int i = 2; i <= num; i++) {
                numArr[i] = numArr[i - 2] + numArr[i - 1];
            }
        }
        return numArr[num];
    }
}