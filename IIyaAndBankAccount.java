import java.util.*;
public class IIyaAndBankAccount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int amt= sc.nextInt();
        if(amt>0){
            System.out.println(amt);
        }if(amt<0){
            int option1 = amt / 10;
            int option2 = (amt / 100) * 10 + amt % 10;
            System.out.println(Math.max(option1, option2));
        }
    }
}