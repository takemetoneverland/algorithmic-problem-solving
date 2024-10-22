import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int total = 0;

            for (int j = N; j <= M; j++) {
                String number = Integer.toString(j);
                for (int k = 0; k < number.length(); k++) {
                    if (number.charAt(k) == '0') {
                        total++;
                    }
                }
            }
            System.out.println(total);
        }
    }
}