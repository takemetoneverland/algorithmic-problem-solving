import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookMinute = sc.nextInt();
        int now = (hour * 60) + minute;
        int result = now + cookMinute;

        int resultHour = result / 60;
        if (resultHour > 23) {
            resultHour -= 24;
        }

        int resultMinute = result % 60;
        System.out.println(resultHour + " " + resultMinute);
    }
}