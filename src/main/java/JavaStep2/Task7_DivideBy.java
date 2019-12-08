package JavaStep2;


import java.util.Scanner;

public class Task7_DivideBy {
    public static void main(String[] args) {

        Scanner numIn = new Scanner(System.in);
        System.out.println("Enter the number to be divided:  ");
        double numMain = numIn.nextDouble();
        System.out.println("You entered " + numMain);

        boolean ciklas = true;
        while (ciklas) {
            System.out.println("Enter the number for division:  ");
            double num = numIn.nextDouble();
            if (num != 0) {
                double numMainNext = numMain / num;
                System.out.printf("%.4f", numMainNext);
                numMain = numMainNext;
            } else {
                System.out.println("You entered 0!");
                ciklas = false;
            }
        }
    }
}
