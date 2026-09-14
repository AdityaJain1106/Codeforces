import java.util.*;

public class NotDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 1) {
                    a[i] = 2;
                }
            }
            for (int i = 1; i < n; i++) {
                if (a[i] % a[i - 1] == 0) {
                    a[i]++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}