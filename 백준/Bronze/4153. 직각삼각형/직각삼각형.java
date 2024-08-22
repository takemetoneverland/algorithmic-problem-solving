import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLong()) {
            //세 변 길이 입력
            long[] arr = new long[3];

            for(int i=0; i<arr.length; i++) {
                arr[i] = sc.nextLong();
            }

            //0 0 0 입력 시 종료
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            Arrays.sort(arr);

            //직각삼각형 -> right 출력 3 : 4 : 5
            if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
                System.out.println("right");
            } else {
                //직각삼각형x -> wrong 출력
                System.out.println("wrong");
            }
        }
        sc.close();
    }
}