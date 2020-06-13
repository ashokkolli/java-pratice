package sorting.practice;

public class BubbleSort {

    //It takes inputs array, length
    //Returns sorted array
    //Bubble sort is the simplest sorting algorithm, that works by repeatedly swapping the adjacent elements.
    //When current element is greater than next element, then SWAP the elements
    //If we have total N elements, then we have to repeat this process for N-1 elements
    //It is know as BUBBLE SORT because, for every complete iteration, LARGEST ELEMENT in the Array bubble up
    //Towards it's right place in the ascending order
    public static int[] bubbleSort(int[] arr) {
        int temp;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr)
            System.out.println(i);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 5, 3};
        int len = arr.length;
        bubbleSort(arr);
    }


}
