import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] phoneCalls = new int[N];

        for (int i = 0; i < N; i++) {
            phoneCalls[i] = sc.nextInt();
        }

        int planM = 0;
        int planY = 0;

        for (int time : phoneCalls) {
            planM += ((time / 60) + 1) * 15;
            planY += ((time / 30) + 1) * 10;
        }

        if (planM == planY) {
            System.out.println("Y M " + planY);
        } else if (planM < planY) {
            System.out.println("M " + planM);
        } else {
            System.out.println("Y " + planY);
        }
    }
}