import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();

        int num3 = num1 * (num2.charAt(2) - '0');
        int num4 = num1 * (num2.charAt(1) - '0');
        int num5 = num1 * (num2.charAt(0) - '0');
        int result = num1 * Integer.parseInt(num2);

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(result);
    }
}