import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IntegerToRoman {
    public static HashMap<Integer,String> map = new HashMap<>();
    
    static{
       map.put(1, "I");
       map.put(2, "II");
       map.put(3, "III");
       map.put(4, "IV");
       map.put(5, "V");
       map.put(6, "VI");
       map.put(7, "VII");
       map.put(8, "VIII");
       map.put(9, "IX");
       map.put(10, "X");
       map.put(20, "XX");
       map.put(30, "XXX");
       map.put(40, "XL");
       map.put(50, "L");
       map.put(60, "LX");
       map.put(70, "LXX");
       map.put(80, "LXXX");
       map.put(90, "XC");
       map.put(100, "C");
       map.put(100, "C");
       map.put(200, "CC");
       map.put(300, "CCC");
       map.put(400, "CD");
       map.put(500, "D");
       map.put(600, "DC");
       map.put(700, "DCC");
       map.put(800, "DCCC");
       map.put(900, "CM");
       map.put(1000, "M");
       map.put(2000, "MM");
       map.put(3000, "MMM");
       

    }

    public static void main(String[] args){
        System.out.println(new IntegerToRoman().intToRoman(33));
    }
    public String intToRoman(int num) {
        String s= "";
        int i =0;
        while (num>0) {
            
            int number  = num %10;
            int x =(int) (num*(Math.pow(10, i)));
            if(number == 0 &&map.containsKey(x)){
                s = map.get(x)+s;
                break;
            }
            int n =(int) (number*(Math.pow(10, i)));
            if(map.containsKey(n)){
                s= map.get(n)+s;
            }
           
             num = num/10;
             i++;
        }
        return s;
    }
}
