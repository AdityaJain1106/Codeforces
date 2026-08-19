import java.util.*;
public class TeleportationEasyVersion{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int teleportersCount=sc.nextInt();
            int coins=sc.nextInt();
            int[] teleporters=new int[teleportersCount+1];
            for (int i = 1; i <= teleportersCount; i++) {
                teleporters[i]=sc.nextInt();
            }
            int[] travelTeleportCoins=new int[teleportersCount+1];
            for (int i = 1; i <= teleportersCount; i++) {
                travelTeleportCoins[i]=i+teleporters[i];
            }
            Arrays.sort(travelTeleportCoins);
            int count=0;
            for (int i = 1; i <= teleportersCount; i++) {
                if(travelTeleportCoins[i]<=coins){
                    coins -= travelTeleportCoins[i];
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}