import java.util.Scanner;

public class NUM_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int C = sc.nextInt();
        for(int i = 0; i < C; ++i) {
            int N = sc.nextInt();
            arr = new int[N];
            double sum = 0;
            for(int j = 0; j < N; ++j) {
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }
            double mean = (sum / N) ;
            double count = 0;
            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}