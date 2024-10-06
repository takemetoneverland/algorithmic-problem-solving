import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec1 = sc.nextInt();
        int sec2 = sc.nextInt();
        int sec3 = sc.nextInt();
        int sec4 = sc.nextInt();

        int sum = sec1 + sec2 + sec3 + sec4;
        int min = sum / 60;
        int sec = sum % 60;

        System.out.println(min);
        System.out.println(sec);
    }
}