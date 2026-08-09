import java.util.*;
public class ArpasHardExamAndMehrdadsNaiveCheat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rem = n%4;
        if(n==0){
            System.out.println("1");
        }else{

            if(rem==1){
                System.out.println("8");
            }
            else if(rem==2){
                System.out.println("4");
            }
            else if(rem==3){
                System.out.println("2");
            }
            else if(rem==0){
                System.out.println("6");
            }
        }
        sc.close();
    }
}