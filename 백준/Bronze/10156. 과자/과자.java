import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int price = K * N;

        if (price > M) {
            System.out.println(price - M);
        } else {
            System.out.println(0);
        }
    }
}