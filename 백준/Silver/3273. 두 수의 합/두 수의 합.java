import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];

        String[] strArray = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }

        int x = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int target = x - array[i];
            for (int j = i + 1; j < n; j++) {
                if (array[j] == target) {
                    result++;
                    break;
                }
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
    }
}