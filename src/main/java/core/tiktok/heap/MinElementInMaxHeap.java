package core.tiktok.heap;

public class MinElementInMaxHeap {

    public static void main(String[] args) {
        int[] maxHeap= { 20, 18, 10, 12, 9, 9, 3, 5, 6, 8 };
        findMin(maxHeap);
    }

    public static void findMin(int[] arr){
        int min = arr[arr.length/2 + 1];
        for(int i = arr.length/2 + 1 ; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}
