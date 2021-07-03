import java.util.Scanner;

public class NUM_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next().toUpperCase();
        int[] cnt = new int[26];

        int max = 0;
        char result = '?';

        for (int i = 0; i < A.length(); i++) {
            cnt[A.charAt(i) - 65]++;
            if (max < cnt[A.charAt(i) - 65]) {
                max = cnt[A.charAt(i) - 65];
                result = A.charAt(i);
            } else if (max == cnt[A.charAt(i) - 65]) {
                result = '?';
            }
        }
        System.out.println(result);
    }

}