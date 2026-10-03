import java.util.*;

public class DreamoonAndWiFi {
    static long combination(int n, int r) {
        if (r < 0 || r > n) return 0;
        r = Math.min(r, n - r);
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int target = 0;
        int known = 0;
        int question = 0;
        for (char c : s1.toCharArray()) {
            if (c == '+')
                target++;
            else
                target--;
        }
        for (char c : s2.toCharArray()) {
            if (c == '+')
                known++;
            else if (c == '-')
                known--;
            else
                question++;
        }
        int difference = target - known;
        int plusNeeded = question + difference;
        if (plusNeeded < 0 || plusNeeded % 2 != 0 || plusNeeded > 2 * question) {
            System.out.println(0.0);
            return;
        }
        int x = plusNeeded / 2;
        long successful = combination(question, x);
        long total = 1L << question;
        double probability = (double) successful / total;
        System.out.printf("%.12f%n", probability);
        sc.close();
    }
}