import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        int num1 = array[0] * array[1];
        int num2 = array[2] * array[3] * array[4];

        System.out.println(num1 - num2);
    }
}