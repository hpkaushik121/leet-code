public class LengthOfLastWord {
    public static void main(String[] args){
        System.out.println(new LengthOfLastWord().lengthOfLastWord("a"));
    }
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean flag = true;
        for (int i =  s.length()-1; i >=0; i--) {
            if(s.charAt(i) != ' '){
                length++;
                flag = false;
                continue;
            }
            if(!flag){
                return length;
            }
           
        }
        return length;
       
    }
}
