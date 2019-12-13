package JavaStep2;


import java.util.Scanner;

public class Task8_Echo {
    public static void main(String[] args) {

        Scanner symbolIn = new Scanner(System.in);
        boolean ciklas = true;
        while (ciklas) {
            System.out.println("Iveskite simboli:  ");
            String symbol = symbolIn.nextLine();
            System.out.println("You entered " + symbol + ' ' + turnTheStringAround(symbol));

            System.out.println("Would you like to continue? y/n");
            String answer = symbolIn.nextLine();
            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                ciklas = false;
            }
        }
    }

    private static String turnTheStringAround(String input) {
        // convert String to character array
        // by using toCharArray
        int N = input.length();
        char[] inputCharArr = input.toCharArray();
        char[] inputCharArrReversed = new char[N];
        //for (int i = N ; i >= 0; i--)

        for (int i = 0; i < inputCharArr.length; i++) {
            inputCharArrReversed[N-1 - i] = inputCharArr[i];
            System.out.print(inputCharArr[N -1 - i]);
        }
        //input.getChars(0, N, inputCharArrReversed, 0);
        System.out.println();
        // create object of StringBuilder class
        StringBuilder sb = new StringBuilder();

        // Appends characters one by one
        for (Character ch : inputCharArrReversed) {
            sb.append(ch);
        }
        // convert in string
        return sb.toString();
    }
    /*
    public static String turnTheStringAround(String input) {
        // getBytes() method to convert string
        // into bytes[].
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        String inputOut = result.toString();
        return inputOut;
    }

 */
}
