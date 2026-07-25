
import java.util.*;

public class Sale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totTvSets = sc.nextInt();
        int tvSetsCanCarry = sc.nextInt();

        int arr[] = new int[totTvSets];
        for (int i = 0; i < totTvSets; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < tvSetsCanCarry; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        System.out.println(-sum);
    }
}
