import java.util.Scanner;

class NUM_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 0;
        int Count = 0;
        for (int i = 1; i <= 9; i++) {
            int N = sc.nextInt();
            if (N > Max) {
                Max = N;
                Count = i;
            }
        }
        System.out.println(Max);
        System.out.println(Count);
    }
}

