import java.util.*;

public class YarikAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int currSum = arr[0];
            int maxSum = arr[0];
            for (int i = 1; i < n; i++) {
                if ((arr[i] & 1) != (arr[i - 1] & 1)) {
                    currSum = Math.max(arr[i], currSum + arr[i]);
                }
                else {
                    currSum = arr[i];
                }
                maxSum = Math.max(maxSum, currSum);
            }
            System.out.println(maxSum);
        }
        sc.close();
    }
}