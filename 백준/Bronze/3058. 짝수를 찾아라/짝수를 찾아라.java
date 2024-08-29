import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int sum = 0;
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < 7; j++) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    list.add(num);
                    sum += num;
                }
            }
            Collections.sort(list);
            System.out.println(sum + " " + list.get(0));
        }

    }
}