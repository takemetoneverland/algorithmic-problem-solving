import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numList = new int[N];

        for (int i = 0; i < N; i++) {
            numList[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        scanner.close();

        int result = 0;

        for (int num : numList) {
            if (num == v) {
                result++;
            }
        }

        System.out.println(result);
    }
}