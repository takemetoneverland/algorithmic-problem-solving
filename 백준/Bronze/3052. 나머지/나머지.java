import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt() % 42;
        }

        array = Arrays.stream(array).distinct().toArray();

        System.out.println(array.length);
    }
}