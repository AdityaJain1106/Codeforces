import java.util.*;

public class EvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            long aliceScore = 0;
            long bobScore = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (arr[i] % 2 == 0) {
                        aliceScore += arr[i];
                    }
                } else {
                    if (arr[i] % 2 != 0) {
                        bobScore += arr[i];
                    }
                }
            }
            if (aliceScore > bobScore) {
                System.out.println("Alice");
            } else if (bobScore > aliceScore) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
        sc.close();
    }
}