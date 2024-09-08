import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //상금 N 입력
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //출력 1. 전체 상금의 22%를 제세공과금으로 납부하고 나머지 수령
        int caseA = (int) (N * 0.78);
        System.out.print(caseA + " ");
        //출력 2. 상금의 80%를 필요 경비로 인정받고, 나머지 20%중 22%만을 제세공과금으로 납부하는 경우
        int caseB = (int) ((N * 0.8) + (N * 0.2 * 0.78));
        System.out.print(caseB);
    }
}