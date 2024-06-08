import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    
    public static void main(String[] args){
        String[] wrods ={"fooo","barr","wing","ding","wing"};
        System.out.println(new SubstringWithConcatenationOfAllWords().findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", wrods));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> sol = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        if(words.length==0){
            return sol;
        }
        if(words[0].length() ==0){
            return sol;
        }
        if(words.length==1 && words[0].equals(s)){
            sol.add(0);
            return sol;
        }
        for (int j = 0; j < words.length; j++) {
            if(map.containsKey(words[j])){
                int count = map.get(words[j]);
                map.put(words[j], ++count);
            }else{
                map.put(words[j], 1);
            }
        }
        HashMap<String,Integer> map2 = (HashMap<String, Integer>) map.clone();
        boolean isEven = (words[0].length() %2) >0 ?false: true;
        int leftPointer =0 , rightPointer =0;
        // if(isEven){
            // leftPointer = 1;
            //  rightPointer = (words.length * words[0].length()+1);
             
        // }else{
            leftPointer = 0;
             rightPointer = words.length * words[0].length();
        // }
        
        while (rightPointer<=s.length() && leftPointer<=rightPointer) {
            int l= leftPointer;
            int r= rightPointer;
            // if(leftPointer ==1 && leftPointer<words[0].length() && isEven){
            //     l--;
            //     r--;
            // }
            int index = ifExists(s.substring(l, r),words,map,isEven);
            map = (HashMap<String, Integer>) map2.clone();
            if (index != -1){
                sol.add(leftPointer);
            }
            
            leftPointer++;
            rightPointer++;
                
            }
        


        return sol;
    } 
    public int ifExists(String s, String[] words, HashMap<String,Integer> map ,boolean isEven){
        int totalWords = words.length;
        int winSz = words[0].length();
        int i=0;

        while (i<s.length()) {
            int j = i+winSz;
            // if(j> s.length() && isEven){
            //     j = s.length();
            // }
            String str= s.substring(i, j);
            if(map.containsKey(str)){
                int count = map.get(str);
                --count;
                if(count<0){
                    totalWords = words.length;
                }
                map.put(str, count);
                totalWords--;
            }else{
                totalWords = words.length;
            }
            if(totalWords==0){
                totalWords = words.length;
               return i-winSz;
            }
            i += winSz;
        }
        return -1;
    }
}
