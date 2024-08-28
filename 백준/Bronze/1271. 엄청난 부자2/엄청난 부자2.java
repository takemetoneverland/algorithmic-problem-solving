import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //가진돈 n 입력
        BigInteger n = scanner.nextBigInteger();
        //돈 받으러 온 생명체의 수 m 입력
        BigInteger m = scanner.nextBigInteger();

        //생명체 하나에게 돌아가는 돈의 양 출력
        System.out.println(n.divide(m));
        //남는 돈 출력
        System.out.println(n.remainder(m));
    }
}