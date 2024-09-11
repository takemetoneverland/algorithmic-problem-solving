import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //지하철역 까지 걸어가는 시간
        int A = sc.nextInt(); //숭실대 별관 앞 정류소 버스
        int B = sc.nextInt(); //숭실대 입구역 지하철
        int time;

        if (B != N) {
            time = N + (B - N);
        } else {
            time = B;
        }

        if (time > A) {
            System.out.println("Bus");
        } else if (time < A) {
            System.out.println("Subway");
        } else {
            System.out.println("Anything");
        }
    }
}