//기본수학2 소수2
import java.util.Scanner;

public class NUM_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0, hap = 0, min = 0;

        for (int i = A ; i <= B; ++i) {
            int j;
            for (j = 2; j * j <= i; ++j)
                if (i % j == 0)
                    break;
            if ((j*j > i) && (i != 1)) {
                hap += i;
                if (count == 0)
                    min = i;
                count += 1;
            }
        }

        if (count == 0)
            System.out.println(-1);
        else {
            System.out.println(hap);
            System.out.println(min);
        }
    }
}


