package JavaStep3.Task6_LongestPolindrome;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static JavaStep3.Task6_LongestPolindrome.Util.FILE_LOCATION;

public class LongestPolindromeMain {
    public static void main(String[] args) {
        //String inputOrigin = "Geese";
        List<String> inputList = getInputFromFile();
        String input;
        List<String> polindromList = new ArrayList<>();
        for (String inputOrigin : inputList) {
            for (int i = 0; i < inputOrigin.length(); i++) {
                for (int j = i + 2; j < (inputOrigin.length() + 1); j++) {
                    System.out.println(i + " ," + (j) + " ," + (inputOrigin.length() - i));
                    input = inputOrigin.substring(i, j);
                    System.out.println(input);
                    if (checkPolindrom(input)) {
                        polindromList.add(input);
                    }
                }
            }
        }
        for (String ii : polindromList) {
            System.out.println("polindromu listas: " + ii);
        }
        System.out.println("Longest polindrom: " + longestPolindrom(polindromList));
    }

    public static String longestPolindrom(List<String> polindromList) {
        String stringMax = polindromList.get(0);
        for (String str : polindromList) {
            if (stringMax.length() < str.length()) stringMax = str;
        }
        return stringMax;
    }

    public static List<String> getInputFromFile() {
        List<String> inputList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION));
            String line = br.readLine();

            while (true) {
                if (line == null) {
                    break;
                }
                inputList.add(line); //istisa texta suskaidom elementus ir priskiriam list
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("nieko neperskaite");
        }
        return inputList;
    }

    private static boolean checkPolindrom(String input) {
        return input.equals(turnTheStringAround(input));
    }

    private static String turnTheStringAround(String input) {
        // https://www.geeksforgeeks.org/stringbuilder-reverse-in-java-with-examples/
        StringBuilder reversed = new StringBuilder(input);
        StringBuilder inputReversed = reversed.reverse();
        return inputReversed.toString();
    }

    /*
    private static String turnTheStringAround(String input) {

        char[] hello = input.toCharArray();
        List<Character> trial1 = new ArrayList<>();

        for (char c : hello)
            trial1.add(c);

        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
        return input;
    }*/
}
