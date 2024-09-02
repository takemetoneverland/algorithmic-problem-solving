import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int base = 0;

            for (int i = 1; ; i++) {
                base = (base * 10 + 1) % N;
                if (base == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}