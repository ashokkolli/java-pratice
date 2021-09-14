package core.array.practice;

public class FindPairs_Naive_N2 {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        int len = arr.length;
        //Test
        //1. Check if the core.array is sorted or not
        // 2.check if core.array length is zero or 1 element
        //2. Check if all the core.array chars are digits
        //3. Ask, if they want us to return the just the number of pair or pairs as well.
        //4. What should be the expecting return type.
        //5. what could be the max length of the core.array. What should be done in case of exceeding size.
        int pairCount = 0;
        countPairs(arr, len, sum);

    }

    public static int countPairs(int[] arr, int len, int sum) {
        int count = 0;
        //if core.array length is 0 or 1, return -1
        if (len == 0 | len == 1)
            return -1;
        //travers core.array, take 1st value and add it to all remaining values
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] + arr[j] == sum)
                    count++;
            }
        }

        return count;
    }

}
