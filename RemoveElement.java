public class RemoveElement {

    public static void main(String[] args){
        int[] nums ={1,1,1,1};
        int val =1;
        int k = new RemoveElement().removeElement(nums, val);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
        System.out.print("k= "+k);
       
    }

    public int removeElement(int[] nums, int val) {
       
        int j= nums.length-1;
        try{
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]==val){
                    while (nums[j] == val) {
                        j--;
                    }
                    if(j<i){
                        return j+1;
                    }
                    nums[i] = nums[j];
                    if(i != nums.length-1){
                        j--;
                    }
                    
                }
            }
        }catch(IndexOutOfBoundsException e){
            return 0;
        }
        
        return j+1;
    }
}
