public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] s = {"flower","flow","flight"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(s));
    }

    
    public String longestCommonPrefix(String[] strs) {
        String s = null;
        for (int i = 0; i < strs.length; i++) {
            if(s == null || strs[i].length()<s.length()){
                s= strs[i];
            }
        }
        String sol ="";
        
       for (int j = s.length(); j >=0 ; j--) {
        int count = 0;
            for (int i = 0; i < strs.length; i++) {
                if(strs[i].substring(0,j).equals(s.substring(0,j))){
                    sol = s.substring(0,j);
                    count++;
                }else{
                    break;
                }
            }
            if( count == strs.length){
                return sol;
            }
        }
        return sol;

    }
}
