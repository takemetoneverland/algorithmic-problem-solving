import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numList = new int[N];

        for (int i = 0; i < N; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numList);
        
        for (int num : numList) {
            System.out.println(num);
        }
    }
}