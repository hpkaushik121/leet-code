import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int k = 5;
        int i =0,j = 1;
        int sol = 0;
        Arrays.sort(nums);
        while (i<nums.length-1){
            int sum = nums[i]+nums[j];
            if(sum<k){
                j++;
                if(j>= nums.length){
                    i++;
                    j = i+1;
                }
            }
             else if(sum == k){
                nums[i] = Integer.MIN_VALUE;
                nums[j] = Integer.MIN_VALUE;
                i++;
                j = i+1;
                sol++;
            }else{
                i++;
                j = i+1;
            }

        }
        System.out.println(sol);
    }
}
