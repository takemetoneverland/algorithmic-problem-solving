import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        char[] wordChar = word.toCharArray();
        char[] reverse = new char[wordChar.length];

        int index = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse[index++] = word.charAt(i);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < wordChar.length; i++) {
            if (wordChar[i] != reverse[i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "1" : "0");
    }
}