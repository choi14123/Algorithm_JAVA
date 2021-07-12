// 재귀함수 팩토리얼
import java.util.Scanner;

public class NUM_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 1;
        int N = sc.nextInt();
        for (int i = N; i >= 1; i--){
            temp = temp * i;
        }
        System.out.println(temp);
    }
}