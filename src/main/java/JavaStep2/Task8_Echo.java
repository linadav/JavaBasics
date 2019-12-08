package JavaStep2;


import java.util.Scanner;

public class Task8_Echo {
    public static void main(String[] args){

        Scanner symbolIn = new Scanner(System.in);
        boolean ciklas = true;
        while (ciklas) {
            System.out.println("Iveskite simboli:  ");
            String symbol = symbolIn.nextLine();
            System.out.println("You entered " + symbol);
            System.out.println("Would you like to continue? y/n");
            String answer = symbolIn.nextLine();
            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                ciklas = false;
            }
        }
    }
}
