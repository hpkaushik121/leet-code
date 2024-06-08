public class JumpGame {

    public static void main(String[] args){
        int[] nums = {};
        System.out.println(new JumpGame().canJump(nums));
    }


    public boolean canJump(int[] nums) {
        boolean sol = false;
        if(nums[0]==0 && nums.length>0){
            return sol;
        }
        if(nums.length==1){
            return true;
        }
        for (int i = nums.length-1; i >=0; i--) {
            
        }

        return sol;
    }
}
