import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                list.add(num);
                total += num;
            }
        }
        Collections.sort(list);

        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(list.get(0));
        }
    }
}