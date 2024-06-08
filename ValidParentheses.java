import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
      System.out.println(new ValidParentheses().isValid("()[]{}"));
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(isOpeningBracke(s.charAt(i))){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    st.push(s.charAt(i));
                    continue;
                }
                if(st.peek() == getOpening(s.charAt(i))){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        return st.isEmpty();
    }
    public boolean isOpeningBracke(char c){
    return (c == '(' || c == '[' || c == '{');
    }
    public char getOpening(char c){
        if(c==')'){
            return '(';
        }
        if(c == ']'){
            return '[';
        }
        return '{';
        }
}
