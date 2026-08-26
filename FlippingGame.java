import java.util.*;

public class FlippingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ones=0;
        int current=0;
        int best=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if (a==1) {
                ones++;
            }
            int gain;
            if(a==0){
                gain=1;
            }else{
                gain=-1;
            }
            current=Math.max(gain,current+gain);
            best=Math.max(best,current);
        }
        System.out.println(ones+best);
        sc.close();
    }    
}

