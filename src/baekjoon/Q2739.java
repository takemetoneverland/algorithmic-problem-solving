package baekjoon;

import java.util.Scanner;

public class Q2739 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dan = input.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
