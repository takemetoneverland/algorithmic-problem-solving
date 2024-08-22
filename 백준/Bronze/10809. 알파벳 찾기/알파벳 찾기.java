import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //입력
        Scanner sc = new Scanner(System.in);
        //단어 s
        String s = sc.next();
        sc.close();

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for(int i=0; i<array.length; i++) {
            //각각의 알파벳에 대해서, 단어가 포함되어 있는 경우 처음 등장하는 위치 출력
            if(s.contains(String.valueOf(array[i]))) {
                System.out.print(s.indexOf(array[i]));
                System.out.print(" ");
            } else {
                //포함되어 있지 않은 경우 -1 출력
                System.out.print("-1");
                System.out.print(" ");
            }
        }
    }
}