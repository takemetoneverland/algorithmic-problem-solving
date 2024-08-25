import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 0;

        for (int num : numbers) {
            if (num == 1) {
                continue;
            }

            int cnt = 0;

            for (int i = 2; i <= num; i++) {
                if (i < num && cnt >= 1) {
                    break;
                }
                if (num % i == 0) {
                    cnt++;
                }
                if (i == num && cnt == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}