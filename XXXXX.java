import java.util.*;

public class XXXXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[size];
            int sum = 0;

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if (sum % x != 0) {
                System.out.println(size);
                continue;
            }
            int left = -1;
            int right = -1;
            for (int i = 0; i < size; i++) {
                if (arr[i] % x != 0) {
                    left = i;
                    break;
                }
            }
            for (int i = size - 1; i >= 0; i--) {
                if (arr[i] % x != 0) {
                    right = i;
                    break;
                }
            }
            if (left == -1) {
                System.out.println(-1);
            } else {
                int removeFromLeft = left + 1;
                int removeFromRight = size - right;
                int answer = size - Math.min(removeFromLeft, removeFromRight);
                System.out.println(answer);
            }
        }
        sc.close();
    }
}