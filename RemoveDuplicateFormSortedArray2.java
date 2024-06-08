import java.util.HashMap;

public class RemoveDuplicateFormSortedArray2 {


    public static void main(String[] args){
        int[] nums = {1,1,1,2,2,2,3,3}; // Input array
        int[] expectedNums = {1,1,2,2,3,3}; // The expected answer with correct length
        
        int k = new RemoveDuplicateFormSortedArray2().removeDuplicates(nums); // Calls your implementation
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.print(k);
    }

    public int removeDuplicates(int[] nums) {
        int pointer1 =0, pointer2=0, pointer3=0;
        HashMap<Integer,Integer> seen = new HashMap<>();
        while (pointer1 < nums.length) {
            if(seen.get(nums[pointer1]) ==null){
                seen.put(nums[pointer1], 1);
            }else{
                int counter =seen.get(nums[pointer1]);
                seen.put(nums[pointer1], ++counter);
            }
            if(seen.get(nums[pointer1]) >2){
            pointer2 =pointer1;
            while (pointer2 < nums.length &&(seen.get(nums[pointer2])!=null && seen.get(nums[pointer2])>=2) ) {
                pointer2++;
            }
            if(pointer2 == nums.length){
                return pointer1;
            }
            int temp = nums[pointer1];
            nums[pointer1] =  nums[pointer2];
            
            if(seen.get(nums[pointer2]) ==null){
                seen.put(nums[pointer2], 1);
            }else{
                int counter =seen.get(nums[pointer2]);
                seen.put(nums[pointer2], ++counter);
            }
            nums[pointer2] = temp;
           }
           if(pointer2 == nums.length-1){
            return pointer1+1;
           }
            pointer1++;
        }
        return pointer1+1;
    }
}
