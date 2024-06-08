import java.util.HashMap;

public class ValidPalindrome {
    private static HashMap<String,String> map = new HashMap<>();
    static{
        map.put("a", "");
        map.put("b", "");
        map.put("c", "");
        map.put("d", "");
        map.put("e", "");
        map.put("f", "");
        map.put("g", "");
        map.put("h", "");
        map.put("i", "");
        map.put("j", "");
        map.put("k", "");
        map.put("l", "");
        map.put("m", "");
        map.put("n", "");
        map.put("o", "");
        map.put("p", "");
        map.put("q", "");
        map.put("r", "");
        map.put("s", "");
        map.put("t", "");
        map.put("u", "");
        map.put("v", "");
        map.put("w", "");
        map.put("x", "");
        map.put("y", "");
        map.put("z", "");
        map.put("", "");
        map.put("0", "");
        map.put("9", "");
        map.put("8", "");
        map.put("7", "");
        map.put("6", "");
        map.put("5", "");
        map.put("4", "");
        map.put("3", "");
        map.put("2", "");
        map.put("1", "");
    }
    
    public static void main(String[] args){
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String input) {
        String firstHalf="";
        String s = input.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        String secondHalf="";
        int i = s.length()-1;
        int j = 0;
        while (i>j) {
            String str1 = (""+s.charAt(i));
            String str2 = (""+s.charAt(j));
            firstHalf += str1;
            secondHalf += str2;
            i--;
            j++;
        } 
        System.out.println(firstHalf);
        System.out.println(secondHalf);
        return firstHalf.equals(secondHalf);
    }
}
