import java.util.*;
public class EatingCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int size=sc.nextInt();
            int[] arr=new int[size];
            for (int i = 0; i < size; i++) {
                arr[i]=sc.nextInt();
            }
            int left=0;
            int right=size-1;
            int answer=0;
                            int leftSum=0;
                int rightSum=0;
            while(left<=right){
                if (leftSum <= rightSum) {
                    leftSum += arr[left];
                    left++;
                } else {
                    rightSum += arr[right];
                    right--;
                }
                if (leftSum == rightSum) {
                    int count = left + (size - 1 - right);
                    answer = Math.max(answer, count);
                }
            }
            System.out.println(answer);
        }
        sc.close();
    }
    
}
