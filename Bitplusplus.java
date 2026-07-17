import java.util.*;

public class Bitplusplus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String ans[] = new String[num];
        for (int i = 0; i < num; i++) {
            ans[i]=sc.next();
        }
        int finalAns = 0;
        for (int i = 0; i < num; i++) {
            if((ans[i]).charAt(1)=='+'){
                finalAns++;
            }else{
                finalAns--;
            }
        }
        System.out.println(finalAns);
        sc.close();
}
}