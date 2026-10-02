import java.util.*;

public class RandomTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long largest = n - m + 1;
        long kMax = largest * (largest - 1) / 2;
        long q = n / m;
        long r = n % m;
        long kMin = r * q * (q + 1) / 2
                  + (m - r) * q * (q - 1) / 2;

        System.out.println(kMin + " " + kMax);
        sc.close();
    }
}