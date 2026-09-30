import java.util.*;

public class SortTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = -1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                l = i;
                break;
            }
        }
        if (l == -1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }
        int r = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > a[i + 1]) {
                r = i + 1;
                break;
            }
        }
        int left = l;
        int right = r;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        System.out.println((l + 1) + " " + (r + 1));
    }
}