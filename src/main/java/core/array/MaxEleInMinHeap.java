//Implementation of find a maximum element in a min heap
//http://eclassesbyravindra.com/mod/page/view.php?id=6575

package core.array;

public class MaxEleInMinHeap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 3, 6, 5, 9, 8};
        findMax(arr, arr.length);
    }

    public static void findMax(int[] arr, int size) {
        int max = Integer.MIN_VALUE, index;
        //Leafs starts at (size/2)+1 in Min Heap
        for (index = (size / 2) + 1; index < size; index++) {
            if (arr[index] > max)
                max = arr[index];
        }
        System.out.println(max);

    }
}
