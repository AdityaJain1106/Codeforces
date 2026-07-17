import java.util.*;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[][] = new int[num][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                ans++;
            }
        }
        System.out.println(ans);
}
}