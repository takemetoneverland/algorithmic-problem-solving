package baekjoon;

import java.util.Scanner;

public class Q2884 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        if (M >= 45) {
            System.out.print(H + " " + (M - 45));
        } else {
            if (H == 0) {
                System.out.println(23 + " " + (M + 60 - 45));
            } else {
                System.out.println((H - 1) + " " + (M + 60 - 45));
            }
        }
    }
}
