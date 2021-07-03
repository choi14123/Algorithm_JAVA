import java.util.Scanner;

public class NUM_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; ++i){

            int A = sc.nextInt();
            String S = sc.next();
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < A; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
