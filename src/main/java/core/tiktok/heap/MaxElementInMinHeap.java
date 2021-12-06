//Implementation of find a maximum element in a min heap
//http://eclassesbyravindra.com/mod/page/view.php?id=6575

package core.tiktok.heap;

public class MaxElementInMinHeap {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 5, 9, 8};
        findMax(arr, arr.length);
        findMax(arr);

    }

    public static void findMax(int[] arr, int size) {
        int max = Integer.MIN_VALUE, index;
        //Leaf nodes starts at (size/2)+1 in Min Heap
        for (index = (size / 2) + 1; index < size; index++) {
            if (arr[index] > max)
                max = arr[index];
        }
        System.out.println(max);
    }

    public static void findMax(int[] arr){
        int max = arr[arr.length/2 + 1];
        for(int i = arr.length/2 + 1 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

}
