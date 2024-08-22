import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        scanner.nextLine();
        String str = "";

        for (int i = 0; i < repeat; i++) {
            str = scanner.nextLine();
            int count = 0;
            int total = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    count++;
                    total += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(total);
        }
    }
}