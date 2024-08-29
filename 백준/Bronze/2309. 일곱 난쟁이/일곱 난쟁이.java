import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int[] answer = new int[7];

        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
        }

        for (int i1 = 0; i1 < 9; i1++) {
            for (int i2 = i1 + 1; i2 < 9; i2++) {
                for (int i3 = i2 + 1; i3 < 9; i3++) {
                    for (int i4 = i3 + 1; i4 < 9; i4++) {
                        for (int i5 = i4 + 1; i5 < 9; i5++) {
                            for (int i6 = i5 + 1; i6 < 9; i6++) {
                                for (int i7 = i6 + 1; i7 < 9; i7++) {
                                    int sum = heights[i1] + heights[i2] + heights[i3] + heights[i4]
                                            + heights[i5] + heights[i6] + heights[i7];
                                    if (sum == 100) {
                                        answer[0] = heights[i1];
                                        answer[1] = heights[i2];
                                        answer[2] = heights[i3];
                                        answer[3] = heights[i4];
                                        answer[4] = heights[i5];
                                        answer[5] = heights[i6];
                                        answer[6] = heights[i7];
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Arrays.sort(answer);

        for (int num : answer) {
            System.out.println(num);
        }
    }
}