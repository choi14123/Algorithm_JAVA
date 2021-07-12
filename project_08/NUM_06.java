// 기본수학2 직각삼각형
import java.util.Scanner;

public class NUM_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1;
        while (N == 1) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (A == 0 && B == 0 && C == 0) break;

            double result = Math.pow(A, 2);
            double result1 = Math.pow(B, 2);
            double result2 = Math.pow(C, 2);

            if (result + result1 == result2) {
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}
