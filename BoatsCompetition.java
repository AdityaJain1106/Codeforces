import java.util.*;

public class BoatsCompetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int maxTeams = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int targetSum = a[i] + a[j];
                    int left = 0;
                    int right = n - 1;
                    int teams = 0;
                    while (left < right) {
                        int currentSum = a[left] + a[right];
                        if (currentSum == targetSum) {
                            teams++;
                            left++;
                            right--;
                        }
                        else if (currentSum < targetSum) {
                            left++;
                        }
                        else {
                            right--;
                        }
                    }
                    maxTeams = Math.max(maxTeams, teams);
                }
            }
            System.out.println(maxTeams);
        }

        sc.close();
    }
}