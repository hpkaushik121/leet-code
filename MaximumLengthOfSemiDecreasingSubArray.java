import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MaximumLengthOfSemiDecreasingSubArray {
    public static void main(String[] args) {
        int[] nums = {57,55,50,60,61,58,63,59,64,60,63};
        int sol =0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int item = nums[i];
            if(map.containsKey(item)){
                List<Integer> arr = new ArrayList<>(map.get(item));
                arr.add(i);
                map.put(item,arr);
            }else{
                map.put(item, List.of(i));
            }

        }
        Arrays.sort(nums);
        for (int i = nums.length-1; i >0; i--) {
            for (int j = i-1; j >=0; j--) {

                List<Integer> maxx = map.get( nums[i]);
                List<Integer> minn = map.get( nums[j]);
                for (Integer value : maxx) {
                    for (Integer integer : minn) {
                        int max = value;
                        int min = integer;
                        if (min > max && sol < (min - max)) {
                            sol = min - max;

                        }
                    }
                }
            }
        }
        System.out.println(sol);
    }
}
