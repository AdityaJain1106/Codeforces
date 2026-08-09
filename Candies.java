import java.util.*;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int value = 3; // 2^2 - 1
            while (value <= n) {
                if (n % value == 0) {
                    System.out.println(n / value);
                    break;
                }
                value = value * 2 + 1;
            }
        }
        sc.close();
    }
}