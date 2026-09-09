import java.util.*;

public class StoneAgeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] arr = new long[n];
        int[] version = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        long global = 0;
        int currentVersion = 0;
        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int i = sc.nextInt() - 1;
                long x = sc.nextLong();
                long oldValue;
                if (version[i] == currentVersion) {
                    oldValue = arr[i];
                } else {
                    oldValue = global;
                }
                sum = sum - oldValue + x;
                arr[i] = x;
                version[i] = currentVersion;
            } else {
                long x = sc.nextLong();
                global = x;
                sum = (long) n * x;
                currentVersion++;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}