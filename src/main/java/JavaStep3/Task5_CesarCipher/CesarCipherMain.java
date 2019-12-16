package JavaStep3.Task5_CesarCipher;


import org.apache.commons.lang3.ArrayUtils;
import sun.security.util.ArrayUtil;

public class CesarCipherMain {
    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] text = "mano batai buvo du".toCharArray();
//        char[] text = "z".toCharArray();
        // System.out.println(alphabet[1] + " " +indexOf(alphabet[1],alphabet));
        System.out.println("Text Original: " + makeString(text));
        System.out.println("Text by Cesar: " + makeString(applyCesarCipher(text, alphabet)));

    }

    private static char[] applyCesarCipher(char[] text, char[] alphabet) {
        char[] textCesar = new char[text.length];
        int shift = 5;
        int iNew;
        for (int i = 0; i < text.length; i++) {
            if (indexOf(text[i], alphabet) < 0) {
                textCesar[i] = text[i];
            } else {
                if (indexOf(text[i], alphabet) > (alphabet.length - 1 - shift)) {
                    iNew = (indexOf(text[i], alphabet) + shift - alphabet.length);
                } else {
                    iNew = indexOf(text[i], alphabet) + shift;
                }
                textCesar[i] = alphabet[iNew];
            }
        }
        return textCesar;
    }

    private static String makeString(char[] textChar) {
        StringBuilder sb = new StringBuilder();

        // Appends characters one by one
        for (Character ch : textChar) {
            sb.append(ch);
        }
        // convert in string
        return sb.toString();
    }

    private static int indexOf(char c, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
