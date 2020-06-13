package practice;

public class CountPairs {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1};
        int sum = 6;
        int countPairs = countPairs(arr, sum);
        System.out.println(countPairs);

    }


    public static int countPairs(int[] arr, int sum) {
        int count = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; i++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }

        return count;
    }

}
