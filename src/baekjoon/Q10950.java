package baekjoon;

import java.util.Scanner;

public class Q10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }

        scanner.close();
    }
}
