import java.util.*;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num[] = new long[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            while (num[i] % 2 == 0) {
                num[i] /= 2;
            }
            if (num[i] > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();

    }
}
