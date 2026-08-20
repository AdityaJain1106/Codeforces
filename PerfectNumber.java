import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int count = 0;
        int number = 1;
        while (count < k) {
            int temp = number;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == 10) {
                count++;
            }
            if (count == k) {
                System.out.println(number);
                break;
            }
            number++;
        }
        sc.close();
    }
}