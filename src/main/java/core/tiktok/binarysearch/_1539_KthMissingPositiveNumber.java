package core.tiktok.binarysearch;

public class _1539_KthMissingPositiveNumber {
    public static void main(String[] args) {
        findKthPositive(new int[]{2,3,4,7,11}, 5);
    }
    public static int findKthPositive(int[] arr, int k) {

        if(k <= arr[0] - 1)
            return k;
        
        System.out.println(k);

        // Search Kth Mising  between the array numbers
        int n = arr.length;
        // [2,3,4,7,11] k = 5
        for(int i = 0; i < n - 1; ++i){
            int currntMissingCount = arr[i+1] - arr[i] - 1; //7-4 == 2
            // If the Kth missing is between
            //arr[i] and arr[i+1] then return it
            if(k <= currntMissingCount)
                return arr[i] + k;
            //Otherwise proceed further
            k = k - currntMissingCount;

        }
        //If the missing number if the greater than arr[n -1]
        return arr[n - 1] + k;

    }
}

