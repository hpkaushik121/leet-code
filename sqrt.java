public class sqrt {

    public static void main(String[] args){
        System.out.println(new sqrt().mySqrt(1));
    }

    public int mySqrt(int x) {
        int y = 1;
        while (  (y * y) < x ) {
            y = y +1;
        }
        if((y * y) != x){
            --y;
        } 
        return y;
    }
}
