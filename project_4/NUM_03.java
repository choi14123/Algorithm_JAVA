import java.util.Scanner;

public class NUM_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int result = 0;
        int copy = N;
        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            result++;
            if (copy == N) {
                break;
            }
        }
        System.out.println(result);
    }
}
