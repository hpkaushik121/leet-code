public class ReverseWordsInAString {

    public static void main(String[] args){
        System.out.println(new ReverseWordsInAString().reverseWords("a good   example"));
    }

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >=0 ; i--) {
            if(!arr[i].equals("")){
                sb.append(arr[i]+" ");
            }
        }
        return sb.toString().trim();
    }
}
