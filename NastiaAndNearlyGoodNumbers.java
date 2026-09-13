import java.util.*;

public class NastiaAndNearlyGoodNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            if (B == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                long x = A;
                long y = A * B;
                long z = A * (B + 1);
                System.out.println(x + " " + y + " " + z);
            }
        }
        sc.close();
    }
}