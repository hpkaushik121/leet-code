import java.util.Arrays;

public class HIndex {

    public static void main(String[] args){
        int[] arr = {3,0,6,1,5};
        System.out.println(new HIndex().hIndex(arr));
    }
    public int hIndex(int[] citations) {
        int h=Integer.MIN_VALUE;
        Arrays.sort(citations);
        for (int i = citations.length-1; i >=0 ; i--) {
            int havingH = Math.min(citations[i], citations.length-i);
            h= Math.max(h, havingH);
        }
        return h;
    }
}
