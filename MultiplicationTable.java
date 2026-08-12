import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long count = 0;

        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                long j = x / i;

                if (i <= n && j <= n) {
                    count++;
                }
                if (i != j && j <= n && i <= n) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}