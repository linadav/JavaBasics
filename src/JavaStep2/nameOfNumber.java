package JavaStep2;

import java.util.Scanner;

public class nameOfNumber {
    public static void main(String[] args){
        // isveskite skaiciaus pavadinima
        String[] skaicius =  {"nulis", "vienas", "du", "trys", "keturi","penki", "sesi", "septyni","astuoni", "devyni"};

        Scanner numIn = new Scanner(System.in);
        System.out.println("Iveskite skaiciu nuo 0 iki 9: ");
        int num = numIn.nextInt();

        System.out.println("Tai yra " + skaicius[num] );
    }
}
