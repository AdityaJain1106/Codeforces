import java.util.Scanner;
public class JzzhuAndSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long n = sc.nextLong();
        long mod = 1000000007L;
        long[] f = new long[6];
        f[0] = x;
        f[1] = y;
        f[2] = y - x;
        f[3] = -x;
        f[4] = -y;
        f[5] = x - y;
        System.out.println((f[(int)((n - 1) % 6)] % mod + mod) % mod);
        sc.close();
    }
}
