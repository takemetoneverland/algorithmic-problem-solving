import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //입력 행렬의 크기 N
        int N = scanner.nextInt();
        //입력 행렬의 크기 M
        int M = scanner.nextInt();

        //선언 2차원 배열 1
        int[][] A = new int[N][M];
        //선언 2차원 배열 2
        int[][] B = new int[N][M];

        //배열에 값 넣기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        //두 행렬 더한 값 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j]);
                if(j != M - 1) {
                    System.out.print(" ");
                }
            }
            if (i != N - 1) {
                System.out.println();
            }
        }
    }
}