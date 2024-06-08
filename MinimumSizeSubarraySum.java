import java.util.Arrays;
import java.util.HashMap;


public class MinimumSizeSubarraySum {
    
    public static void main(String[] args){
        int[] nums = {10,2,3};
        System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(6, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int lftPointer = 0;
        int rightPointer = 1;
        int sum =nums[lftPointer];
        if(sum>=target){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        while (lftPointer<nums.length && rightPointer<nums.length) {
             int tempSum =sum+nums[rightPointer];
            if(tempSum<target){
                sum = tempSum;
                rightPointer++;
            }else{
                if(lftPointer == rightPointer){
                    min =1;
                }
                if(min>(rightPointer-lftPointer)){
                    min = rightPointer - lftPointer+1;
                }
                int n = nums[lftPointer];
                sum = sum -n;
                lftPointer++;
                
            }

        }
        if(min == Integer.MAX_VALUE){
            min = 0;
        }
        return min;
    }

   
}
