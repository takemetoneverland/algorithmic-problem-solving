import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String number = scanner.nextLine();
        char[] charArr = number.toCharArray();

        int total = 0;
        for (char ch : charArr) {
            total += Character.getNumericValue(ch);
        }

        System.out.println(total);
    }
}