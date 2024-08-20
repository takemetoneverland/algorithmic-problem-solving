package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2920 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};

        if (Arrays.equals(array, ascending)) {
            System.out.println("ascending");
        } else if (Arrays.equals(array, descending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
