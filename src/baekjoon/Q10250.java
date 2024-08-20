package baekjoon;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 데이터 개수
        int t = sc.nextInt();

        for(int r=0; r<t; r++) {
            //호텔의 층 수
            int h = sc.nextInt();
            //각 층의 방 수
            int w = sc.nextInt();
            //몇 번째 손님인지
            int n = sc.nextInt();

            String[] roomNumbers = new String[h*w];
            int idx = 0;

            while(idx < roomNumbers.length) {
                for(int i=1; i<=w; i++) { //방
                    for(int j=1; j<=h; j++) { //층
                        if(i < 10) {
                            roomNumbers[idx++] = j + "0" + i;
                        } else {
                            roomNumbers[idx++] = j + "" + i;
                        }
                    }
                }
            }

            System.out.println(roomNumbers[n-1]);
        }
    }
}