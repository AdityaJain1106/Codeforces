import java.util.*;

public class DivisionByTwoAndPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean[] used = new boolean[n];
            boolean possible = true;

            for (int target = n; target >= 1; target--) {
                boolean found = false;
                for (int i = 0; i < n; i++) {
                    if (used[i]) {
                        continue;
                    }
                    int value = a[i];
                    while (value > target) {
                        value /= 2;
                    }
                    if (value == target) {
                        used[i] = true;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}