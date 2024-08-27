import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            list.add(scanner.nextInt());
        }

        int count = 0;

        for (int i = 1; i <= 30 && count < 2; i++) {

            if (!list.contains(i)) {
                System.out.println(i);
                count++;
            }
        }
    }
}