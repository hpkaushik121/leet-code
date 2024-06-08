public class KEmptySlots {
    public static void main(String[] args){
        int[] bulbs = {1,5,6,7,7,5,6,4,8,9};
        int k =2;
        int[] arr = new int[bulbs.length];
        int res = 0;
        int sol = -1;
        int i =1;
        for (int bulb : bulbs) {
            res = 0;
            arr[bulb - 1] = 1;
            int n =0, m = 0;
            for (int j = bulb; n <= k; n++) {
                if (j >= bulbs.length) {
                    res = 0;
                    break;
                }
                if (arr[j] == 1) {
                    break;
                }
                res++;
                j++;

            }
            if (res == k) {
                sol = i;
                break;
            }
            res = 0;

            for (int j = (bulb - 2); m <= k; m++) {
                if (j < 0) {
                    res = 0;
                    break;
                }
                if (arr[j] == 1) {
                    break;
                }
                res++;
                j--;

            }
            if (res == k) {
                sol = i;
                break;
            }
            i++;
        }
        System.out.println(sol);
    }
}
