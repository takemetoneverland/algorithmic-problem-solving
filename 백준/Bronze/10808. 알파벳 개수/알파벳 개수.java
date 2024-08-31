import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];

        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (i == alphabet.length - 1) {
                System.out.print(alphabet[i]);
            } else {
                System.out.print(alphabet[i] + " ");
            }
        }
    }
}