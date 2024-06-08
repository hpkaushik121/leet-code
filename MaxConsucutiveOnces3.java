public class MaxConsucutiveOnces3 {
    public static void main(String[] args){
        int[] nums = {0,0,0,0};
        int k = 0;
        System.out.println( new MaxConsucutiveOnces3().longestOnes(nums,k));
    }
    public  int longestOnes(int[] nums, int k) {

        int i = 0;
        if(k==0){
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]!=0){
                    i = j;
                    break;
                }
            }
        }

        int j = getWindowSize(nums,k,i);
        int zCount = k;
        int max = (j-i)+1;
        while (j< nums.length){

            j++;
            if(j>= nums.length){
                break;
            }
            if(nums[j] == 0){
                zCount++;
            }
            if(zCount>k){
                i++;
                int n = i-1;
                if(n>=0 && nums[n] == 0){
                    zCount--;
                }
            }
            if(zCount == k){
                int size = j-i+1;
                if(max<size){
                    max = size;
                }
            }
        }
        return max;
    }

    private  int getWindowSize(int[] nums, int k,int i) {
        int v = 0;
        while (i < nums.length) {
            if(nums[i] == 0){
                v++;
            }
            if(v<k){
                i++;
            }else{
                break;
            }
        }
        return i;
    }
}
