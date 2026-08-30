import java.util.*;

public class DoraAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0;
            int right = n - 1;
            int min = 1;
            int max = n;

            while (left < right) {
                boolean changed = false;
                if (arr[left] == min) {
                    left++;
                    min++;
                    changed = true;
                }
                else if (arr[left] == max) {
                    left++;
                    max--;
                    changed = true;
                }

                if (arr[right] == min) {
                    right--;
                    min++;
                    changed = true;
                }
                else if (arr[right] == max) {
                    right--;
                    max--;
                    changed = true;
                }

                if (!changed) {
                    break;
                }
            }

            if (left >= right) {
                System.out.println(-1);
            }
            else {
                System.out.println((left + 1) + " " + (right + 1));
            }
        }

        sc.close();
    }
}