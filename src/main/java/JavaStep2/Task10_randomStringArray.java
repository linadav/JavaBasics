package JavaStep2;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Task10_randomStringArray {
    public static void main(String[] args) {
        int randInt;
        String[] stringsArr = new String[5];
        for (int i = 0; i < 5; i++) {
            Random nRnd = new Random();
            randInt = nRnd.nextInt(10);
            System.out.println("String ilgis bus: " + randInt);
            stringsArr[i] = RandomStringUtils.randomAlphabetic(randInt);
            System.out.println(i + ". Random String'as: " + stringsArr[i]);
        }
        System.out.println("***** Longest String: " + longestString(stringsArr) + " *********");
    }
    private static String longestString(String[] stringsArr){
        int n = stringsArr[1].length();
        String longestString = stringsArr[0];
        for (int i = 0; i<stringsArr.length; i++){
            if (n < stringsArr[i].length()){
                longestString = stringsArr[i];
            }
        }
        return longestString;
    }
}
