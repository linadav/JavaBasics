package JavaStep3.Task3_TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        String[][] stringsArr = new String[3][3];
        int[] coord = new int[2];
        int[] coordComp;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                stringsArr[i][j] = " ";
            }
        }
        printGameField(stringsArr);

        int iCycle = 0;
        boolean continueGame = true;
        while (continueGame) {
            iCycle++;
            boolean newCoord = true;
            while (newCoord) {
                coord = askCoordinates();
                newCoord = checkCoordinates(stringsArr, coord);//bolean
                System.out.println("Koordinates: " + (coord[0] + 1) + ", " + (coord[1] + 1)); // eilute; stulpelis
            }
            stringsArr[coord[0]][coord[1]] = "X"; // zaidejas
            if (gameOver(stringsArr, "X")) {
                System.out.println("Sveikiname! Ju laimejote!");
                continueGame = false;
            } else {
                // printGameField(stringsArr);
                coordComp = computerCoordinates(stringsArr);
                stringsArr[coordComp[0]][coordComp[1]] = "O"; // kompas
                System.out.println(iCycle + ". Kompo coord: " + (coordComp[0] + 1) + ", " + (coordComp[1] + 1));
                printGameField(stringsArr);
                if (gameOver(stringsArr, "O")) {
                    System.out.println("Deja, bet pralaimėjote!");
                    continueGame = false;
                }
            }

            if (iCycle == 5) {
                if (! continueGame){
                    System.out.println("Jūs laimėjote paskutiniu ėjimu!");
                } else {
                    continueGame = false;
                    System.out.println("Niekas nelaimejo. Ačiū už žaidimą!");
                }
            }
        }
    }

    public static boolean gameOver(String[][] stringsArr, String smb) {
        // tikriname, ar kazkas laimejo
        boolean gameOver = false;
        for (int i = 0; i < 3; i++) {
            if (stringsArr[i][0].equals(stringsArr[i][1]) && stringsArr[i][0].equals(stringsArr[i][2]))
                if (stringsArr[i][0].equals(smb))
                    gameOver = true;
        }
        for (int j = 0; j < 3; j++) {
            if (stringsArr[0][j].equals(stringsArr[1][j]) && stringsArr[0][j].equals(stringsArr[2][j]))
                if (stringsArr[0][j].equals(smb))
                    gameOver = true;
        }
        if (stringsArr[0][0].equals(stringsArr[1][1]) && stringsArr[0][0].equals(stringsArr[2][2]))
            if (stringsArr[0][0].equals(smb))
                gameOver = true;

        if (stringsArr[0][2].equals(stringsArr[1][1]) && stringsArr[0][2].equals(stringsArr[2][0]))
            if (stringsArr[0][2].equals(smb))
                gameOver = true;
        return gameOver;
    }

    public static int[] computerCoordinates(String[][] stringsArr) {
        // kompo koordinaciu generavimas
        int iRandInt = 0;
        int jRandInt = 0;

        boolean cycle = true;
        while (cycle) {
            Random nRnd = new Random();
            System.out.println("compoCooordGeneravimas");
            iRandInt = nRnd.nextInt(3);
            jRandInt = nRnd.nextInt(3);
            System.out.println("compoCooordGeneravimas:" + iRandInt + ", " + jRandInt);
            if (stringsArr[iRandInt][jRandInt].equals(" ")) {
                cycle = false;
            } else {
                cycle = true;
                System.out.println("compoCooordGeneravimas, true" + iRandInt + ", " + jRandInt);
            }
        }
        int[] coord = {iRandInt, jRandInt};
        return coord;
    }

    public static boolean checkCoordinates(String[][] stringArr, int[] inputCoordinates) {
        int i = inputCoordinates[0];
        int j = inputCoordinates[1];
        if (i<3 && j<3 && i>-1 && j>-1 && stringArr[i][j].equals(" ")) {
            return false;
        } else {
            System.out.println("Neteisingos koordinates!");
            return true;
        }
    }

    public static int[] askCoordinates() {
        Scanner playerInput = new Scanner(System.in);

        int iAnswer = 0;
        int jAnswer = 0;
        System.out.println("Iveskite X koordinates: ");
        System.out.println("Eilute: ");
        iAnswer = playerInput.nextInt();
        System.out.println("Stulpelis: ");
        jAnswer = playerInput.nextInt();
        int[] coord = {iAnswer - 1, jAnswer - 1};
        return coord;
    }

    public static void printGameField(String[][] stringsArr) {
        System.out.println("    ...1...2...3...");
        String[][] s = stringsArr;
        for (int i = 0; i < 3; i++) {
            System.out.print("   " + (i + 1) + ":  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(s[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("      ---|---|---");
            }
        }

    }
}
