package core.searching;

public class SearchMinElementInSortedRotatedArray {


    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 1, 2};
        int key = 5;
        int len = arr.length;
        pivotedBinarySearch(arr, len, key);

    }

    public static void pivotedBinarySearch(int[] arr, int n, int key) {
        int keyIndex = -1;
        int minElement = findPivot(arr, 0, n - 1);
        System.out.println("Min ele ment is is : " + arr[minElement]);


    }

    public static int findPivot(int[] arr, int l, int r) {
        //This conditon needs to be handled if core.array is not rotated at all
        if (r < l) {
            return arr[0];
        }
        //if there is only one element left
        if (l == r) {
            return arr[l];
        }
        int m = (l + r) / 2;

        if (arr[m] > arr[m + 1]) {
            System.out.println("pivot value is :" + arr[m + 1]);
            //Pivot index is m+1
            return m + 1;
        } else {
            if (arr[l] > arr[m]) {
                return findPivot(arr, l, m - 1);
            } else {
                return findPivot(arr, m + 1, r);
            }

        }
    }

}
