import java.util.*;

public class ReplacingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();
            int d = sc.nextInt();

            int[] nums = new int[size];

            for (int i = 0; i < size; i++) {
                nums[i] = sc.nextInt();
            }

            Arrays.sort(nums);

            if (nums[size - 1] <= d) {
                System.out.println("YES");
            } else if (nums[0] + nums[1] <= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}