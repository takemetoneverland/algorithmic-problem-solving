import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //입력 : 테스트 케이스의 개수
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            //입력 : 테스트 문자열
            String str = scanner.nextLine();
            String result = "";
            result += str.charAt(0);
            result += str.charAt(str.length() - 1);
            //출력 : 각 테스트 케이스에 대해서 주어진 문자열의 첫글자와 마지막 글자를 출력
            System.out.println(result);
        }


    }
}