// 기본수학1 손익분기점
import java.util.Scanner;

public class NUM_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int M;
        if(C <= B) {
            System.out.println(-1);
        }
        else {
            M = A / (C - B) + 1;
            System.out.println(M);
            }


    }
}
