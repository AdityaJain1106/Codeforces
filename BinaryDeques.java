import java.util.*;

public class BinaryDeques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int currentSum = 0;
            int maxLength = -1;
            for (int right = 0; right < size; right++) {
                currentSum += arr[right];
                while (left <= right && currentSum > s) {
                    currentSum -= arr[left];
                    left++;
                }
                if (currentSum == s) {
                    int length = right - left + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }

            if (maxLength == -1) {
                System.out.println(-1);
            } else {
                System.out.println(size - maxLength);
            }
        }
        sc.close();
    }
}