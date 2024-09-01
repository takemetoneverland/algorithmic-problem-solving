import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nowHour = sc.nextInt();
        int nowMinute = sc.nextInt();
        int nowSecond = sc.nextInt();
        int cookSecond = sc.nextInt();

        int nowTimeSecond = (nowHour * 3600) + (nowMinute * 60) + nowSecond;
        int afterCookSecond = nowTimeSecond + cookSecond;

        int afterHour = afterCookSecond / 3600;
        int afterMinute = (afterCookSecond % 3600) / 60;
        int afterSecond = (afterCookSecond % 3600) % 60;

        if (afterHour > 23) {
            afterHour %= 24;
        }

        System.out.printf("%d %d %d", afterHour, afterMinute, afterSecond);
    }
}