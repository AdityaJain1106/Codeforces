import java.util.*;
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(a[i] > h){
                ans += 2;
            }else{
                ans += 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}