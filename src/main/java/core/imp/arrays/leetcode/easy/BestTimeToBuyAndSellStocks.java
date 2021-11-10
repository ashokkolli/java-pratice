package core.imp.arrays.leetcode.easy;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
    public static int maxProfit_bt(int[] arr){
        int maxProfit = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
//        int[] prices = {7,1,5,3,6,4};
    //Kadane's algorithm.
    public static int maxProfit(int[] prices){
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        for (int price : prices) {
            min_price = Math.min(min_price, price);
            max_profit = Math.max(max_profit, price-min_price);
            /*if (price - min_profit > max_profit)
                max_profit = price - min_profit;*/
        }
        System.out.println(max_profit);
        return max_profit;

    }

}
