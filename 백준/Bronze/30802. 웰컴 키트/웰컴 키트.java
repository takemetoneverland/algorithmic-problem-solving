import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //참가자의 수 n
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //티셔츠 사이즈별 신청자의 수 S, M, L, XL, XXL, XXXL
        long[] tshirt = new long[6];

        for(int i=0; i<tshirt.length; i++) {
            tshirt[i] = sc.nextLong();
        }

        //티셔트의 묶음 수 t, 펜의 묶음 수 p
        long t = sc.nextLong();
        long p = sc.nextLong();

        //출력
        //티셔츠를 t장씩 최소 몇 묶음 주문해야하는지 출력
        long total = 0;
        for(int i = 0; i<tshirt.length; i++) {
            total += tshirt[i] / t;
            total = tshirt[i] %  t > 0 ? total + 1 : total;
        }
        System.out.println(total);

        //펜을 p자루씩 최대 몇묶음 주문할 수 있는지, 그 때 펜을 한 자루씩 몇개 주문하는지
        System.out.println(n / p + " " + n % p);
    }
}