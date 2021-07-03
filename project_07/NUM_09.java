import java.util.Scanner;

public class NUM_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String st = sc.nextLine();

        for (int i = 0; i < st.length(); ++i) {
            if (st.contains(S[i]))
                st = st.replace(S[i], "!");
        }
        System.out.println(st.length());
    }
}
