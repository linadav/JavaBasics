package JavaStep2;

public class ChristmasTrees {
    public static void main(String[] args) {
        String smb = "*";
        int n = 5;

        System.out.println("K U B A S: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(smb);
            }
            System.out.println();
        }

        System.out.println("T R I K A M P I S: ");
        int nc = n / 2;
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (nc - i) || j > nc + i) {
                    System.out.print(" ");
                }
                if (j >= (nc - i) && j <= (nc + i)) {
                    System.out.print(smb);
                }
            }
            System.out.println();
        }
        System.out.println("C H R I S T M A S tree: ");
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (nc - i) || j > nc + i) {
                    System.out.print(" ");
                }
                if (j >= (nc - i) && j <= (nc + i)) {
                    System.out.print(smb);
                }
            }
            System.out.println();
        }

        for (int i = n - 2; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < nc || j > nc) {
                    System.out.print(" ");
                }
                if (j == nc) {
                    System.out.print(smb);
                }
            }
            System.out.println();
        }
    }
}
