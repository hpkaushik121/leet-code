import java.util.HashMap;

public class ZigZagConversion {

    public static void main(String[] args){
        System.out.println(new ZigZagConversion().convert("AB", 2));
    }

    public String convert(String s, int numRows) {
        if(numRows ==1){
            return s;
        }
        HashMap<Integer,String> map = new HashMap<>();
        int i=0;
        boolean flag =false;
        int counter = 1;
        while (i<s.length()) {
            if(!flag){
                //increase
                if(!map.containsKey(counter)){
                    map.put(counter, ""+s.charAt(i));
                }else{
                    map.put(counter, map.get(counter)+s.charAt(i));
                }
               
                counter++;
                if(counter > numRows){
                    counter = numRows;
                    flag = true;
                }
            }else{
                //decrease
                counter--;
                if(!map.containsKey(counter)){
                    map.put(counter, ""+s.charAt(i));
                }else{
                    map.put(counter, map.get(counter)+s.charAt(i));
                }
                
                if(counter ==1){
                    counter = 2;
                    flag = false;
                }
            }
            i++;
        }
        String str="";
        for (int j = 1; j <= numRows; j++) {
            if(!map.containsKey(j)){
                break;
            }
            str +=map.get(j);
        }
        return str;
    }
}
