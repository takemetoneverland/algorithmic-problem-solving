package baekjoon;

import java.util.Scanner;

public class Q2577 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int total = A * B * C;
        String str = Integer.toString(total);

        int[] array = new int[10];

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (Character.getNumericValue(str.charAt(i)) == j) {
                    array[j]++;
                }
            }
        }

        for (int n : array) {
            System.out.println(n);
        }
    }
}
