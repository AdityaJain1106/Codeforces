import java.util.*;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = sc.nextLong();
            long b = sc.nextLong();

            long common = Math.min(x, y);
            long diff = Math.abs(x - y);

            long cost = common * Math.min(b, 2 * a)
                      + diff * a;

            System.out.println(cost);
        }

        sc.close();
    }
}