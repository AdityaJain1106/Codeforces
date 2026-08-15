import java.util.*;
public class Fence {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int planks=sc.nextInt();
        int neededPlanks=sc.nextInt();

        int [] heights=new int[planks];
        for(int i=0;i<planks;i++){
            heights[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<neededPlanks;i++){
            sum+=heights[i];
        }
        int minSum=sum;
        int answer=1;

        for (int i = neededPlanks; i < planks; i++) {
            sum = sum - heights[i - neededPlanks] + heights[i];
            if (sum < minSum) {
                minSum = sum;
                answer = i - neededPlanks + 2;
            }
        }
        System.out.print(answer);
        sc.close();

    }
    
}
