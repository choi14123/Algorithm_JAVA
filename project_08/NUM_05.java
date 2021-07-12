// 기본수학2 네번째 점
import java.util.Scanner;

public class NUM_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int A2 = sc.nextInt();
        int B2 = sc.nextInt();
        int A3 = sc.nextInt();
        int B3 = sc.nextInt();
        if (A == A2) {
            System.out.println(A3);
        }
        else if (A == A3) {
            System.out.println(A2);
        }
        else{
            System.out.println(A);
        }
        if (B == B2) {
            System.out.println(B3);
        }
        else if (B == B3) {
            System.out.println(B2);
        }
        else{
            System.out.println(B);
        }
    }
}

