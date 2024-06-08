public class PlusOne {

    public static void main(String[] args){
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] arr = new PlusOne().plusOne(digits);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

    public int[] plusOne(int[] digits) {
        String number="";
        int carry = 1;
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]==9 && carry == 1){
                number = "0"+number;
            }else{
                String str = ""+digits[i];
                if(carry == 1){
                    str = ""+(Integer.parseInt(str)+1);
                    carry = 0;
                }
                number = str+number;
            }
            
        }
        if(carry == 1){
            number = "1"+number;
            carry = 0;
        }
        int[] arr1= new int[number.length()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=Integer.parseInt(""+number.charAt(i));
        }
        return arr1;
    }
}
