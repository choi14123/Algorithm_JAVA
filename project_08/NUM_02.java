// 기본수학1 달팽이
import java.util.Scanner;

public class NUM_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int D = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            D++;
        }
        System.out.println(D);
    }
}

