import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //입력
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        //출력
        System.out.println(str.length());
    }
}