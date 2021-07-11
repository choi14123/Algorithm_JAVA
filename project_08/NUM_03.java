// 기본수학2 소수1
import java.util.Scanner;

public class NUM_03 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sosuCount = 0, count = 0;

        for (int i = 1; i <= N; i++) {
            int N2 = sc.nextInt();
            sosuCount = 0;

            for (int j = 1; j <= N2; j++) {
                if (N2 % j == 0)
                    sosuCount += 1;
            }
            if (sosuCount == 2)
                count += 1;
        }
        System.out.print(count);
    }
}