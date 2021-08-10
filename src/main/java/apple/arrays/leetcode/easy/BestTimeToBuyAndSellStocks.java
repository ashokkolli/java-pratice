package apple.arrays.leetcode.easy;

public class BestTimeToBuyAndSellStocks {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
    }
    public static int maxProfit_bt(int[] arr){
        int maxProfit = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

}
