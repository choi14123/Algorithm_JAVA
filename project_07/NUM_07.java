import java.util.Scanner;

public class NUM_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int Maxa = (A / 100) + ((A % 100) / 10) * 10 + (A % 10) * 100;
        int Maxb = (B / 100) + ((B % 100) / 10) * 10 + (B % 10) * 100;

        System.out.println(Math.max(Maxa, Maxb));

    }
}
