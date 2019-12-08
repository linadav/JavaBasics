package JavaStep2;

import java.util.Random;

public class Task9_RandomClass {
    public static void main(String[] args) {
        int nArr = 10; // masyvo dydis
        int iCycle = 5; // ciklu skaicius
        int[] intArr; // = new int[n];
        for (int i = 0; i < iCycle; i++) { //
            Random random = new Random();
            intArr = random.ints(nArr,0,100).toArray();
            for (int iArr : intArr) {
                System.out.print(iArr + " ");
            }
            System.out.println();
            System.out.println("Array No. " + i +" Largest element: " + maxArrayElement(intArr));
        }
    }
    private static double maxArrayElement (int[] intArray){
        int maxValue = intArray[0];
        for (int intA: intArray){
            maxValue = Math.max(maxValue, intA);
        }
        return maxValue;
    }
}
