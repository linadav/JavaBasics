package JavaPrograms;

import java.math.BigInteger;

public class MaxInteger {
    public static void main(String[] args) {
        int intMax = Integer.MAX_VALUE;

        BigInteger A, sumBigInt;
        A = BigInteger.valueOf(intMax);
        sumBigInt = A.add(A);
        System.out.println("BigInt: "+ sumBigInt);
    }
}
