package JavaPrograms;
import java.util.Scanner;

public class RoundedDouble {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("iveskite skaiciu: xxxx,xxxx");
        double number = numberScanner.nextDouble();

        System.out.printf("Ivedete skaiciu: %.2f", number);
    }
}