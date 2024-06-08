import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MinimumWindowSubString {
    HashMap<Character, Integer> freqMap = new HashMap<>();
    HashMap<Character, Integer> map = new HashMap<>();
    public static void main(String[] args){
        System.out.println(new MinimumWindowSubString().minWindow("ab", "b"));
    }

    public String minWindow(String str, String t) {
        if(t.length() ==1 && str.length() ==1 && t.charAt(0) == str.charAt(0)){
            return t.charAt(0)+"";
        }
        for (int i = 0; i < t.length(); i++) {
            if(freqMap.containsKey(t.charAt(i))){
                int count = freqMap.get(t.charAt(i));
                freqMap.put(t.charAt(i), ++count);
            }else{
                freqMap.put(t.charAt(i), 1);
            }
        }
        int s = 0;
        int e = 1;
        map.put(str.charAt(s), 1);
        int winSize =Integer.MAX_VALUE;
        String res = "";
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(s));
        if(checkIfFreqMatch()){
            return sb.toString();
        }
        int prevE = -1;
        while(s<=e && e<str.length()){
            if(prevE <e){
                sb.append(str.charAt(e));
            if(map.containsKey(str.charAt(e))){
                int count = map.get(str.charAt(e));
                map.put(str.charAt(e), ++count);
            }else{
                map.put(str.charAt(e), 1);
            }
            }
            prevE = e;
            if(checkIfFreqMatch()){
                if(winSize>(e-s)+1){
                    winSize = (e-s)+1;
                    res =  sb.toString();
                }
                char c = str.charAt(s);
                int count = map.get(c);
                map.put(c, --count);
                sb.deleteCharAt(0);
                s++;
            }else{
                e++;
            }
        }
        return res;
        
    }
    public boolean checkIfFreqMatch(){
        for (Map.Entry<Character,Integer> entry : freqMap.entrySet()) {
            if(!map.containsKey(entry.getKey())){
                return false;
            }
            if(map.get(entry.getKey()) < entry.getValue()){
                return false;
            }

        }
        return true;
    }
}
