import java.util.*;

public class AlternatingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0;
            long max = sc.nextLong();
            for (int i = 1; i < n; i++) {
                long x = sc.nextLong();
                if ((x > 0 && max > 0) || (x < 0 && max < 0)) {
                    max = Math.max(max, x);
                }
                else {
                    sum += max;
                    max = x;
                }
            }
            sum += max;
            System.out.println(sum);
        }
        sc.close();
    }
}