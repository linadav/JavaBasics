package JavaStep3.Task3_TicTacToe;

public class TicTacToeMain {
    public static void main(String[] args){
        String[][] stringsArr = new String[3][3];
        for (String[] str : stringsArr){
            for (String str1: str){
                str1 = " ";
            }

       }
        printGameField(stringsArr);
    }
    public static void printGameField(String[][] stringsArr){
        System.out.println("...1...2...3...");
            for (int i=0; i<3; i++){
                System.out.print("   "+i);
            for (int j=0; j<3; j++) {
                System.out.print("  ");
            }
        }

    }
}
