public class MajorityElement{

    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        int k = new MajorityElement().majorityElement(arr);
        System.out.println(k);
    }


    public int majorityElement(int[] nums) {
        int counter=0;
        int candidate=-1;
        for (int i = 0; i < nums.length; i++) {
            if(counter==0){
                candidate= nums[i];
            }
            if(candidate == nums[i]){
                counter++;
            }else{
                counter--;
            }
        }
        return candidate;
    }
}