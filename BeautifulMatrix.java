import java.util.*;

public class BeautifulMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row=0;
        int col=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int a=sc.nextInt();
                if(a==1){
                    row=i;
                    col=j;
                }
            }
        }
        System.out.println(Math.abs(row-2)+Math.abs(col-2));
        sc.close();
    }
}
