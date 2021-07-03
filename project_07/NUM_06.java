import java.util.Scanner;

public class NUM_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine().trim();

        if (A.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(A.split(" ").length);
        }
    }
}