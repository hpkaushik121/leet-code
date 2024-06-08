import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args){
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(new UniqueNumberOfOccurrences().uniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                int k= map.get(arr[i]);
                map.put(arr[i], ++k);
            }else{
                map.put(arr[i], 1);
            }
        }
        Set<Entry<Integer, Integer>> entry= map.entrySet();
        for (Entry<Integer, Integer> integer : entry) {
            map2.put(integer.getValue(), 1);
        }
         return map2.size()==map.size();
    }
}
