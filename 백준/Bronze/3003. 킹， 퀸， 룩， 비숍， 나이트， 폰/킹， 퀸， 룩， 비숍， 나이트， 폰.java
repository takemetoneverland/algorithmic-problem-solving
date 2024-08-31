import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] pieces = new int[6];
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            pieces[i] = sc.nextInt();
        }

        for (int i = 0; i < chess.length; i++) {
            if (chess[i] > pieces[i]) {
                result[i] = chess[i] - pieces[i];
            } else if (chess[i] < pieces[i]) {
                result[i] = chess[i] - pieces[i];
            } else {
                result[i] = 0;
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                System.out.print(result[i]);
            } else {
                System.out.print(result[i] + " ");
            }
        }
    }
}