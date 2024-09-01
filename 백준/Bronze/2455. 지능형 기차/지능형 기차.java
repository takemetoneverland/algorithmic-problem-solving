import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int total = 0;

        for (int i = 0; i < 4; i++) {
            int offPassenger = sc.nextInt();
            int onPassenger = sc.nextInt();

            total -= offPassenger;
            total += onPassenger;

            if (total > max) {
                max = total;
            }
        }

        System.out.println(max);
    }
}