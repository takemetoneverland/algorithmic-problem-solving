import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int xw = w - x;
        int yh = h - y;

        int minX = Math.min(x, xw);
        int minY = Math.min(y, yh);

        System.out.println(Math.min(minX, minY));
    }
}