import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int n : array) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }

        System.out.println(min + " " + max);
    }
}