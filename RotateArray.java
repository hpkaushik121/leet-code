import java.util.ArrayList;

public class RotateArray {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        new RotateArray().rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+", ");
        }
    }

     public void rotate(int[] nums, int k) {
        if(nums.length==1){
            return;
        }
        
        while(k>=nums.length){
            k = k- nums.length;
        }
        int[] arr= new int[nums.length];
        
        for(int i=0;i<k;i++){
            arr[i] =nums[nums.length-(k-i)];
        }
        int n=0;
        
        for (int i = k; i < nums.length; i++) {
            arr[i]=nums[n];
            n++;
        }
        for (int j = 0; j < arr.length; j++) {
            nums[j]=arr[j];
        }
    }
}
