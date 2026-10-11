import java.util.Scanner;
public class TroubleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean hasZero = false;
            boolean hasOne = false;
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();

                if (b[i] == 0) hasZero = true;
                else hasOne = true;
            }
            boolean sorted = true;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    sorted = false;
                    break;
                }
            }
            System.out.println(
                (hasZero && hasOne) || sorted ? "Yes" : "No"
            );
        }
        sc.close();
    }
}
