package core.tiktok.arrays;
/*
*
* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

*
* */
public class _121_BestTimetoBuyandSellStock {

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

    //for every element, we are calculating
    // the difference between that element and the minimum of all the values before that element,
    // and we are updating the maximum profit if the difference thus found is greater than the current maximum profit.
    public static int maxProfit(int[] prices){
        int max_profit = 0;
        int min_price = Integer.MAX_VALUE;
        for (int price : prices) {
            min_price = Math.min(min_price, price);
            max_profit = Math.max(max_profit, price - min_price);
            /*if (price - min_profit > max_profit)
                max_profit = price - min_profit;*/
        }
        System.out.println(max_profit);
        return max_profit;

    }

}
