import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] burgers = new int[3];
        int[] beverage = new int[2];

        for (int i = 0; i < 3; i++) {
            burgers[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            beverage[i] = sc.nextInt();
        }

        Arrays.sort(burgers);
        Arrays.sort(beverage);

        System.out.println(burgers[0] + beverage[0] - 50);
    }
}