import java.util.*;

public class MahmoudAndATriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        for (int i = 0; i < n - 2; i++) {
            if (a[i] + a[i + 1] > a[i + 2]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        sc.close();
    }
}