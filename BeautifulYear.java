import java.util.*;
public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();//2013 -> output 2014
        while(true){
            year++;
            String s=Integer.toString(year);
            Set<Character> set=new HashSet<>();
            for(int i=0;i<s.length();i++){
                set.add(s.charAt(i));
            }
            if(set.size()==s.length()){
                System.out.println(year);
                break;
            }
        }
        sc.close();
    }
}