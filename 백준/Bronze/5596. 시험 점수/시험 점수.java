import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strS = sc.nextLine().split(" ");
        String[] strT = sc.nextLine().split(" ");
        int S = 0;
        int T = 0;

        for (int i = 0; i < 4; i++) {
            S += Integer.parseInt(strS[i]);
            T += Integer.parseInt(strT[i]);
        }

        if (S > T) {
            System.out.println(S);
        } else {
            System.out.println(T);
        }
    }
}