import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            total += num;
            numbers[i] = num;
        }

        Arrays.sort(numbers);

        System.out.println(total / 5);
        System.out.println(numbers[5 / 2]);
    }
}