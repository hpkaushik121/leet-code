import java.util.stream.IntStream;

public class RichestCustomerWealth {
    
    public int maximumWealth(int[][] accounts) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int s = IntStream.of(accounts[i]).sum();
            if(sum< s){
                sum = s;
            }

        }
        return sum;
    }
}
