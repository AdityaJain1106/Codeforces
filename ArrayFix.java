import java.util.*;

public class ArrayFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int last = 0;
            boolean possible = true;
            for (int x : a) {
                if (x < 10) {
                    if (x < last) {
                        possible = false;
                        break;
                    }
                    last = x;
                }
                else {
                    int tens = x / 10;
                    int ones = x % 10;
                    if (tens >= last && tens <= ones) {
                        last = ones;
                    }
                    else if (x >= last) {
                        last = x;
                    }
                    else {
                        possible = false;
                        break;
                    }
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}