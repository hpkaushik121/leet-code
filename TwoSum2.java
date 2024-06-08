import java.util.HashMap;

public class TwoSum2 {

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,4,9,56,90};
        int[] arr = new TwoSum2().twoSum(numbers, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[]=new int[2];
        int i = numbers.length-1;
        int j =0;
        while (i>j) {
           
            int requiredNumber = target- numbers[i];
            int requiredNumber2 = target- numbers[j];
            if(!map.containsKey(requiredNumber) ){
                map.put(numbers[i], i);
            }
            if(!map.containsKey(requiredNumber2) ){
                map.put(numbers[j], j);
            }
           
             if(map.containsKey(requiredNumber2)){
                int index = map.get(requiredNumber2);
                if(index==i){
                    i--;
                    j++;
                    continue;
                }
                if(index<j){
                    arr[0]=index+1;
                    arr[1]=j+1;
                }else{
                    arr[1]=index+1;
                    arr[0]=j+1;
                }
            }else if(map.containsKey(requiredNumber) ){
                int index = map.get(requiredNumber);
                if(index==i){
                    i--;
                    j++;
                    continue;
                }
                if(index<i){
                    arr[0]=index+1;
                    arr[1]=i+1;
                }else{
                    arr[1]=index+1;
                    arr[0]=i+1;
                }
            }
           
            i--;
            j++;
           
        }
        if(i==j){
            int requiredNumber = target- numbers[i];
            if(map.containsKey(requiredNumber) ){
                int index = map.get(requiredNumber);
                if(index<i){
                    arr[0]=index+1;
                    arr[1]=i+1;
                }else{
                    arr[1]=index+1;
                    arr[0]=i+1;
                }
            }
        }
        return arr;
    }
}
