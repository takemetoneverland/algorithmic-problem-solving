package baekjoon;

import java.util.Scanner;

public class Q2475 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            total += num * num;
        }

        System.out.println(total % 10);
    }
}
