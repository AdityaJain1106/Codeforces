import java.util.*;

public class KuriyamaMiraisStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        long[] prefix = new long[size + 1];
        long[] sortedPrefix = new long[size + 1];
        for (int i = 0; i < size; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
            sortedPrefix[i + 1] = sortedPrefix[i] + sortedArr[i];
        }

        int noOfQues = sc.nextInt();
        for (int i = 0; i < noOfQues; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            long ans;
            if (type == 1) {
                ans = prefix[r] - prefix[l - 1];
            } else {
                ans = sortedPrefix[r] - sortedPrefix[l - 1];
            }
            System.out.println(ans);
        }
        sc.close();
    }
}