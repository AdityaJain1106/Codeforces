import java.util.*;

public class TernaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int left = 0;
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int minLength = Integer.MAX_VALUE;

            for (int right = 0; right < s.length(); right++) {
                if (s.charAt(right) == '1') {
                    count1++;
                } else if (s.charAt(right) == '2') {
                    count2++;
                } else {
                    count3++;
                }

                while (count1 > 0 && count2 > 0 && count3 > 0) {
                    int length = right - left + 1;
                    minLength = Math.min(minLength, length);
                    if (s.charAt(left) == '1') {
                        count1--;
                    } else if (s.charAt(left) == '2') {
                        count2--;
                    } else {
                        count3--;
                    }
                    left++;
                }
            }

            if (minLength == Integer.MAX_VALUE) {
                System.out.println(0);
            } else {
                System.out.println(minLength);
            }
        }
        sc.close();
    }
}