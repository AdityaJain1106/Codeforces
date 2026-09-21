import java.util.*;

public class ExcitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == b) {
                System.out.println("0 0");
                continue;
            }
            long d = Math.abs(a - b);
            long r = a % d;
            long moves = Math.min(r, d - r);
            System.out.println(d + " " + moves);
        }
        sc.close();
    }
}