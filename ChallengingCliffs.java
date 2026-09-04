import java.util.*;

public class ChallengingCliffs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (size == 2) {
                System.out.println(arr[0] + " " + arr[1]);
                continue;
            }
            int minDiff = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < size - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                if (diff < minDiff) {
                    minDiff = diff;
                    index = i;
                }
            }
            for (int i = index + 1; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}