import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jaehwan = sc.nextLine();
        String doctor = sc.nextLine();

        String answer = "go";

        if (jaehwan.length() < doctor.length()) {
            answer = "no";
        }

        System.out.println(answer);
    }
}