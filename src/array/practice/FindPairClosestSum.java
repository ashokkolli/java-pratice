package array.practice;

public class FindPairClosestSum {

    public static void closestSum(int[] arr, int x) {
        int len = arr.length;
        int l = 0;
        int r = len - 1;
        int diff = Integer.MAX_VALUE;
        int rl = 0, rr = 0;
        while (l < r) {
            if (Math.abs((arr[l] + arr[r] - x)) < diff) {
                rl = l;
                rr = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }
            if (arr[l] + arr[r] > x)
                r--;
            else
                l++;

        }
        System.out.println(arr[rl] + " " + arr[rr]);

    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 28, 29, 30, 40};
        int x = 54;
        closestSum(arr, x);

    }
}
