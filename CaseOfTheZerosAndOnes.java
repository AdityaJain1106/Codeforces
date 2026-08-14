import java.util.*;

public class CaseOfTheZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int zeros = 0;
        int ones = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        }

        int answer = n - 2 * Math.min(zeros, ones);
        System.out.println(answer);
        sc.close();
    }
}