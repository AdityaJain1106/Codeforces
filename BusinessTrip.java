import java.util.*;

public class BusinessTrip {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int k=sc.nextInt();
        int [] months=new int[12];
        for(int i=0;i<12;i++){
            months[i]=sc.nextInt();
        }
        if(k==0){
            System.out.println(0);
        }else{
            Arrays.sort(months);
            int sum=0;
            int count=0;
            for(int i=11;i>=0;i--){
                sum+=months[i];
                count++;
                if(sum>=k){
                    System.out.println(count);
                    break;
                }
            }
            if(sum<k){
                System.out.println(-1);
            }
        }
        sc.close();
    }
    }