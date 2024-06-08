import java.util.HashMap;

public class MaxNumberOfVowels {
    public static void main(String[] args){
        String s= "abciiidef";
        int k =3;
        System.out.println(maxVowels(s,k));
    }
    public static int maxVowels(String s, int k) {
        int i = 0;
        int j = k-1;
        HashMap<Integer,Integer> map = new HashMap<>();

        int max = getVowelCount(s,0,k,map);
        int sol =max;
        while (j<s.length()){


            i++;
            int n = i-1;
            if(n>=0 && map.containsKey(n) && isVowel(s.charAt(n))){
                max--;
            }
            j++;
            if(j<s.length()&& isVowel(s.charAt(j))){
                max++;
            }
            if(sol<max){
                sol = max;
            }
            map.put(i,i);
            map.put(j,j);
        }
        return Math.max(sol, 0);
    }
    public static boolean isVowel(char c){
        return c =='a' || c=='e' || c=='i'
                || c =='o' || c=='u';
    }
    public static int getVowelCount(String s,int max,int k,HashMap<Integer,Integer> map){
        int v = 0;

        for (int l = 0; l < k; l++) {
            char c = s.charAt(l);
            map.put(l,l);
            if(isVowel(c)){
                v++;
            }
            if(max<v){
                max = v;
                if(v == k){

                    return max;
                }
            }

        }
        return v;
    }
}
