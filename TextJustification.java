import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TextJustification {
    public static void main(String[] args){
        String arr[] = {"ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"};
        List<String> ls = new TextJustification().fullJustify(arr, 16);
        
        System.out.println(ls);
    }
     public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ls = new ArrayList<>();
        HashMap<String,String> str = new HashMap<>();
        
        String temp = "";
        String temp1 = "";
        for (int i = 0; i < words.length; i++) {
            temp1 += words[i]+" ";
            if(temp1.trim().length()<=maxWidth){
                temp = temp1;
            }else{
                ls.add(getPadded(temp.trim(),maxWidth));
                temp1 = words[i]+" ";
                temp = temp1;
                
            }
            if(i==words.length-1){
                temp1 = temp1.trim();
                int requiredLength = maxWidth - temp1.length();
                for (int j = 0; j < requiredLength; j++) {
                    temp1 = temp1+" ";
                }
                ls.add(temp1);
            }
        }

        return ls;
    }
    private String getPadded(String temp, int maxWidth) {
        int requiredLength = maxWidth - temp.replace(" ", "").length();
        String[] arr = temp.split(" ");
        int k=0;
        while (requiredLength>0) {
            if(k == arr.length-1 && arr.length>1){
                arr[k] = " "+arr[k];
                
            }else{
                arr[k] = arr[k]+" ";
            }
            k++;
            if(k>=arr.length-1){
                k=0;
            }
            
            requiredLength--;
        }
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str+arr[i];
        }
        return str;
    }
    
}