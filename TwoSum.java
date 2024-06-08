import java.util.HashMap;
import java.util.Hashtable;

public class TwoSum
 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int target=5;
        int[] arr =new TwoSum().twoSum(nums, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer,Integer> DP = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target-x;
            if(DP.get(y) != null){
                if (i>DP.get(y)){
                    sol[0]=DP.get(y);
                    sol[1]=i;
                }else{
                    sol[0]=i;
                    sol[1]=DP.get(y);
                }
                
            }else{
                DP.put(x,i );
            }

        }

        return sol;
    }
}
