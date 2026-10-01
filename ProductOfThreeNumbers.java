import java.util.*;

public class ProductOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long a = -1, b = -1, c = -1;
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    n /= i;
                    break;
                }
            }
            if (a == -1) {
                System.out.println("NO");
                continue;
            }
            for (long i = a + 1; i * i <= n; i++) {
                if (n % i == 0) {
                    b = i;
                    n /= i;
                    break;
                }
            }
            c = n;
            if (b == -1 || c <= 1 || a == b || a == c || b == c) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);
            }
        }
        sc.close();
    }
}