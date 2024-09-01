import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String[] yoot = sc.nextLine().split(" ");
            int cnt1 = 0;
            int cnt0 = 0;

            for (String y : yoot) {
                if (y.equals("1")) {
                    cnt1++;
                } else {
                    cnt0++;
                }
            }

            //A : 0 - 1, 1 - 3, B : 0 - 2, 1 - 2, C : 0 - 3, 1 - 1, D : 0 - 4
            if (cnt0 == 4) {
                System.out.println("D");
            } else if (cnt0 == 1 && cnt1 == 3) {
                System.out.println("A");
            } else if (cnt0 == 2 && cnt1 == 2) {
                System.out.println("B");
            } else if (cnt0 == 3 && cnt1 == 1) {
                System.out.println("C");
            } else {
                System.out.println("E");
            }
        }
    }
}