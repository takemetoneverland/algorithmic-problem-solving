import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            String[] sentence = str.split(" ");

            String result = "";

            for (int j = 0; j < sentence.length; j++) {
                String word = sentence[j];
                for (int k = word.length() - 1; k >= 0; k--) {
                    result += word.charAt(k);
                }
                if (j != sentence.length - 1) {
                    result += ' ';
                }
            }
            System.out.println(result);
        }
    }
}