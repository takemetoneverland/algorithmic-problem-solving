import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextInt();
        long M = scanner.nextInt();

        System.out.println(Math.abs(N - M));
    }
}