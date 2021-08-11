package apple.arrays.leetcode.easy;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
    public static int maxProfit_bt(int[] arr){
        int maxProfit = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minProfit = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            minProfit = Math.min(minProfit, prices[i]);
            if(prices[i] - minProfit > maxProfit)
                maxProfit = prices[i] - minProfit;

        }
        System.out.println(maxProfit);
        return maxProfit;

    }

}
