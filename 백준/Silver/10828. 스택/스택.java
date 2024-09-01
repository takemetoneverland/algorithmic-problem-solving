import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (st.hasMoreTokens()) {
                int number = Integer.parseInt(st.nextToken());
                stack.push(number);
            } else {
                if (order.equals("pop")) {
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                } else if (order.equals("size")) {
                    System.out.println(stack.size());
                } else if (order.equals("empty")) {
                    if (stack.empty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else if (order.equals("top")) {
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                }
            }
        }
    }
}