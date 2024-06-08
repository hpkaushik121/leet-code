import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

int k = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums); // Calls your implementation
System.out.println(k);
assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
    }

    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1; i<nums.length; i++) {
            if(nums[j]!=nums[i]) {
                nums[++j]=nums[i];
            }
        }
        return j+1;
    }
}
