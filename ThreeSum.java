import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
    
    public static void main(String[] args){
        int[] nums ={-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(new ThreeSum().threeSum(nums));
    }


     public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> answer = new ArrayList<>();
            
            if (nums.length < 3) {
                return answer;
            }
            
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] > 0) {
                    break;
                }
                
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                
                int low = i + 1, high = nums.length - 1;
                while (low < high) {
                    int sum = nums[i] + nums[low] + nums[high];
                    if (sum > 0) {
                        high--;
                    } else if (sum < 0) {
                        low++;
                    } else {
                        answer.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        int lastLowOccurrence = nums[low];
                        int lastHighOccurrence = nums[high];
                        
                        while (low < high && nums[low] == lastLowOccurrence) {
                            low++;
                        }
                        
                        while (low < high && nums[high] == lastHighOccurrence) {
                            high--;
                        }
                    }
                }
            }
            return answer;
        
    }
}
