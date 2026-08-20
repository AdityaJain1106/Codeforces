import java.util.*;

public class BadPrices{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int size=sc.nextInt();
            int[] arr=new int[size];
            for (int i = 0; i < size; i++) {
                arr[i]=sc.nextInt();
            }
            int minPrice = arr[size - 1];
            int badDays = 0;

            for (int i = size - 2; i >= 0; i--) {
                if (arr[i] > minPrice) {
                    badDays++;
                } else {
                    minPrice = arr[i];
                }
            }

            System.out.println(badDays);
        }
        sc.close();
    }
}