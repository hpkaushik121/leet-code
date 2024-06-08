public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        int[] arr = {-1,1,0,-3,3};
        int[] arr1 = new ProductOfArrayExceptSelf().productExceptSelf(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int zeroCount=0;
        int product=1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                if(zeroCount ==2){
                    break;
                }
                zeroCount++;
            }else{
                product = product * nums[i];
            }
            
        }
        if(zeroCount>=2){
            return new int[nums.length];
        }
        int[] sol = new int[nums.length];
        for (int i = 0; i < sol.length; i++) {
            if(zeroCount>0){
                if(nums[i]==0){
                    sol[i] = product ;
                }
            }else{
                sol[i] = product / nums[i];
            }
        }
        return sol;
    }
}
