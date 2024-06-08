public class BInarySearch {
    public static void main(String[] args){
        int[] nums ={-1,0};
        int target = 0;
        System.out.println(new BInarySearch().search(nums, target));
    }
    public int search(int[] nums, int target) {
        
        int high = nums.length-1;
        int low =0;
        int mid = (low + (high - low) )/ 2;
        while(low<=high){
            
            if(nums[mid]>target){
                high = mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else {
               return mid;
            }
            
            mid = low + (high - low) / 2;
        }
        return -1;
    }
}
