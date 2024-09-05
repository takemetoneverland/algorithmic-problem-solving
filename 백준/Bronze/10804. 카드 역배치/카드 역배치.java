import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] tempArray = new int[b - a + 1];
            int idx = b - a;
            for (int j = a - 1; j <= b - 1; j++) {
                tempArray[idx--] = numbers[j];
            }

            idx = 0;
            for (int j = a - 1; j <= b - 1; j ++) {
                numbers[j] = tempArray[idx++];
            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}