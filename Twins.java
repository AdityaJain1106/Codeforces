import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int totSum = 0;
        for (int i = 0; i < n; i++) {
            totSum += a[i];
        }
        int mySum = 0;
        for (int i = n - 1; i >= 0; i--) {
            mySum += a[i];
            if (mySum > totSum - mySum) {
                System.out.println(n - i);
                return;
            }
        }
        sc.close();
    }
}
