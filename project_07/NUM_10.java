import java.util.Scanner;

public class NUM_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int[] st = new int[100];
        int tg = 0;
        int cnt=0;
        for(int i =0; i<a; i++) {
            String b = sc.nextLine();

            for(int j=0; j<b.length(); j++) {
                st[j]= b.charAt(j);

            }
            for(int j=0; j<b.length(); j++) {
                for(int x=j+2; x<b.length(); x++) {
                    if(st[j]==st[x-1]) {
                    }
                    else {
                        if(st[j]==st[x]) {
                            tg=1;
                        }
                    }
                }
            }
            if(tg==0) {
                cnt++;
            }
            tg=0;
        }
        System.out.println(cnt);
    }
}
