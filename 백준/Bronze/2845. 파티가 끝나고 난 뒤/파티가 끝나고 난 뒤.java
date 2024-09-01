import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        int realParticipant = L * P;

        int[] participant = new int[5];

        for (int i = 0; i < 5; i++) {
            participant[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(participant[i] - realParticipant);
            } else {
                System.out.print(participant[i] - realParticipant + " ");
            }
        }
    }
}
