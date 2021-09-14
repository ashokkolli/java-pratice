package core.searching;

public class BinarySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;
        BinarySearch bs = new BinarySearch();
        int i = bs.binarySearch(arr, key);
        if (i == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at Index : " + i);


    }

    int binarySearch(int[] arr, int key) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (key == arr[m])
                return m;
            else if (key < arr[m])
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;

    }
}
