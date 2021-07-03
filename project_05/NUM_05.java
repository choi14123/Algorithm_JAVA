import java.util.Scanner;

public class NUM_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        int max = 0;
        int score;
        for (int i = 0; i < N; ++i) {
            score = sc.nextInt();
            total += score;
            if (score > max) {
                max = score;
            }
        }
        double avg = 0;
        avg = 100.0 * total / max / N;
        System.out.println(avg);
    }
}