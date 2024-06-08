public class FindTheIndexOfFirstOccurenceInTheString {
    public static void main(String[] args){
        System.out.println(new FindTheIndexOfFirstOccurenceInTheString().strStr("leetcode", "ode"));
    }
    public int strStr(String haystack, String needle) {
        int sol =-1;
        for (int i = 0; i <= (haystack.length()-needle.length());i++) {
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                sol = i;
                break;
            }
        }
        return sol;
    }
}
