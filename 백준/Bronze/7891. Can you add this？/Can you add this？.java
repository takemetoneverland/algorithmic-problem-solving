import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            BigInteger num1 = sc.nextBigInteger();
            BigInteger num2 = sc.nextBigInteger();

            System.out.println(num1.add(num2));
        }

    }
}