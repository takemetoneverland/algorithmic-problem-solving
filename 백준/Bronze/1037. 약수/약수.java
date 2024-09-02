import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] number = new int[count];

        for (int i = 0; i < count; i++) {
            number[i] = sc.nextInt();
        }

        Arrays.sort(number);

        System.out.println(number[0] * number[count - 1]);
    }
}