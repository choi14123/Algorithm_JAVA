import java.util.Scanner;

public class NUM_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 1;
        while (A != 0){
                A = sc.nextInt();
            if (A == 0)
                break;
            int B = sc.nextInt();
                System.out.println((A+B));
        }
    }
}
