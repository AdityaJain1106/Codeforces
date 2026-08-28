//all pairs, giving O(n²), which will fail for n = 10⁵
//So, Group numbers according to their highest set bit.

// For example:

// 1       → bit 0
// 2,3     → bit 1
// 4,5,6,7 → bit 2
// 8...15  → bit 3

// If a group contains k numbers, the number of pairs is:

// $$ \frac{k(k-1)}{2} $$

// Since ai < 10⁹, there are only 30 possible highest-bit positions.
import java.util.*;

public class RockAndLeaver{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int size=sc.nextInt();
            long[] count = new long[31];
            for (int i = 0; i < size; i++) {
                int x = sc.nextInt();
                int highestBit = 31 - Integer.numberOfLeadingZeros(x);
                count[highestBit]++;
            }
            long ans = 0;
            for (int i = 0; i < 31; i++) {
                ans += count[i] * (count[i] - 1) / 2;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}