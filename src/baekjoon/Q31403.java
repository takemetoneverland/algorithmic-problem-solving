package baekjoon;

import java.util.Scanner;

public class Q31403 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        System.out.println((A + B) - C);
        System.out.println(Integer.parseInt(("" + A + B)) - C);
    }
}
