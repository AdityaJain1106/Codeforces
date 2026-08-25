import java.util.*;

public class ParityAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> even = new ArrayList<>();
            long maxOdd = -1;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    even.add(x);
                } else {
                    maxOdd = Math.max(maxOdd, x);
                }
            }
            if (even.isEmpty() || maxOdd == -1) {
                System.out.println(0);
                continue;
            }
            Collections.sort(even);
            int answer = even.size();
            for (int x : even) {
                if (x < maxOdd) {
                    maxOdd += x;
                } else {
                    answer++;
                    break;
                }
            }
            System.out.println(answer);
        }
        sc.close();
    }
}