import java.util.*;

public class BeforeAnExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sumTime = sc.nextInt();
        int[] minTime = new int[d];
        int[] maxTime = new int[d];
        int[] schedule = new int[d];
        int minTotal = 0;
        for (int i = 0; i < d; i++) {
            minTime[i] = sc.nextInt();
            maxTime[i] = sc.nextInt();
            schedule[i] = minTime[i];
            minTotal += minTime[i];
        }
        if (minTotal > sumTime) {
            System.out.println("NO");
            return;
        }
        int remaining = sumTime - minTotal;
        for (int i = 0; i < d; i++) {
            int canAdd = maxTime[i] - minTime[i];
            int add = Math.min(remaining, canAdd);
            schedule[i] += add;
            remaining -= add;
        }
        if (remaining == 0) {
            System.out.println("YES");
            for (int i = 0; i < d; i++) {
                System.out.print(schedule[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}