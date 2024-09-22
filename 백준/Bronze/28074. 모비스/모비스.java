import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "YES";
        char[] mobis = {'M', 'O', 'B', 'I', 'S'};

        for (int i = 0; i < mobis.length; i++) {
            if (!str.contains(String.valueOf(mobis[i]))) {
                result = "NO";
                break;
            }
        }

        System.out.println(result);
    }
}