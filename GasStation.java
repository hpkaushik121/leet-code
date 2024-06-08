import java.util.LinkedList;

public class GasStation {
    public static void main(String[] args){
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int k = new GasStation().canCompleteCircuit(gas, cost);
        System.out.println(k);
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
       
        int isPossible=0;
        for (int i = 0; i < cost.length; i++) {
            cost[i]= gas[i] - cost[i];
            
            isPossible = isPossible+ cost[i];
        }
        if(isPossible>=0){
            int found = -1;
            int startIndex =0;
            
            boolean flag = false;
            
            while (found == -1) {
                int i=startIndex;
                int able =0;
               while (i!=startIndex || !flag) {
                flag = true;
                 able = able +cost[i];
                 if( able<0){
                    break;
                 }
                i++;
                if(i== cost.length){
                    i=0;
                }
               }
               if(i== startIndex && able>=0){
                found = gas[i-1];
               }
               flag = false;
               startIndex++;
            }
            return found;
        }else{
            return -1;
        }
    }
}
