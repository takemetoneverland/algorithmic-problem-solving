import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        Arrays.sort(scores);
        int maxScore = scores[N-1];
        Double[] newScores = new Double[N];

        for (int i = 0; i < scores.length; i++) {
            newScores[i] = (double) scores[i] / maxScore * 100;
        }

        double sum = 0;
        for (Double score : newScores) {
            sum += score;
        }

        System.out.println(sum / N);

    }
}