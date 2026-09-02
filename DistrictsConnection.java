import java.util.*;

public class DistrictsConnection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int different = -1;
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    different = i;
                    break;
                }
            }
            if (different == -1) {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for (int i = 1; i < n; i++) {
                if (a[i] != a[0]) {
                    System.out.println(1 + " " + (i + 1));
                }
            }
            for (int i = 1; i < n; i++) {
                if (a[i] == a[0]) {
                    System.out.println((different + 1) + " " + (i + 1));
                }
            }
        }
        sc.close();
    }
}