package searching;

public class SearchInSortedArrayRoatated {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 1, 2};
        int key = 5;
        int len = arr.length;
        pivotedBinarySearch(arr, len, key);

    }

    public static void pivotedBinarySearch(int[] arr, int n, int key) {
        int keyIndex = -1;
        int pivotIndex = findPivot(arr, 0, n - 1);
        System.out.println("pivot index is : " + pivotIndex);
        if (key == arr[pivotIndex]) {
            System.out.println("Key Index is : " + pivotIndex);
        }

        if (key > arr[pivotIndex] && key < arr[n - 1]) {
            keyIndex = binarySearch(arr, pivotIndex + 1, n - 1, key);
            System.out.println("Key Index : " + keyIndex);

        }
        if (key > arr[0] && key < arr[pivotIndex]) {
            System.out.println("in Else");
            keyIndex = binarySearch(arr, 0, pivotIndex - 1, key);
            System.out.println("Key Index : " + keyIndex);


        }
    }

    public static int findPivot(int[] arr, int l, int r) {
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

    public static int binarySearch(int[] arr, int l, int r, int key) {
        int m = (l + r) / 2;
        int keyIndex = -1;
        while (l <= r) {

            if (arr[m] == key)
                keyIndex = m;
            else if (key < arr[m])
                r = m - 1;
            else
                l = m + 1;
        }
        System.out.println("Key Inedex is :" + keyIndex);
        return keyIndex;

    }
}
