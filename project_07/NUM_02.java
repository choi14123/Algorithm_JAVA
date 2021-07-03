import java.util.Scanner;

public class NUM_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String a = sc.next();

        int Hap = 0;

        for(int i = 0; i < N; i++) {
            Hap += a.charAt(i)-'0';
        }
        System.out.print(Hap);
    }
}