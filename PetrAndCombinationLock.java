//recursion + backtracking

import java.util.*;

public class PetrAndCombinationLock {
    static boolean solve(int[] arr, int index, int sum) {
        if (index == arr.length) {
            return sum % 360 == 0;
        }
        if (solve(arr, index + 1, sum + arr[index])) {
            return true;
        }
        if (solve(arr, index + 1, sum - arr[index])) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (solve(arr, 0, 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}