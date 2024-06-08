public class MaxProfit {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new MaxProfit().maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int maxProfit= 0;
        int buyingPrice = prices[0];
        for(int j=1;j<prices.length;j++){
            if(prices[j]>buyingPrice){
                maxProfit = Math.max(maxProfit, prices[j]-buyingPrice);
            }else{
                buyingPrice = prices[j];
            }
        }
        return maxProfit;
    }
}
