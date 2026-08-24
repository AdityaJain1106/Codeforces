import java.util.*;

public class FunWithEvenSubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int target = a[n - 1];
            int correct = 1;
            int i = n - 2;

            while (i >= 0 && a[i] == target) {
                correct++;
                i--;
            }
            int ans = 0;
            while (i >= 0) {
                ans++;
                i -= correct;
                correct *= 2;
                while (i >= 0 && a[i] == target) {
                    correct++;
                    i--;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}