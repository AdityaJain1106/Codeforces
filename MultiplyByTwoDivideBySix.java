import java.util.*;

public class MultiplyByTwoDivideBySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int count = 0;
            int num = nums[i];
            while (num > 1) {
                if (num % 6 == 0) {
                    num /= 6;
                } else {
                    num *= 2;
                }
                count++;
            }
            if (num == 1) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
