import java.util.*;

public class Matryoshkas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            int maxFreq = 0;
            int freq = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    freq++;
                }
                else if (a[i] == a[i - 1] + 1) {
                    maxFreq = Math.max(maxFreq, freq);
                    freq = 1;
                }
                else {
                    maxFreq = Math.max(maxFreq, freq);
                    ans += maxFreq;
                    maxFreq = 0;
                    freq = 1;
                }
            }
            maxFreq = Math.max(maxFreq, freq);
            ans += maxFreq;

            System.out.println(ans);
        }
        sc.close();
    }
}