import java.util.*;

public class ThreePartsOfTheArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int left = 0;
        int right = n - 1;
        long leftSum = 0;
        long rightSum = 0;
        long ans = 0;
        while (left <= right) {
            if (leftSum <= rightSum) {
                leftSum += a[left];
                left++;
            } else {
                rightSum += a[right];
                right--;
            }
            if (leftSum == rightSum) {
                ans = Math.max(ans, leftSum);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}