package core.array;

public class FindFirstKLargestElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {12, 13, 1, 10, 34, 1};
        //Length should be >=3
        //perform Selection Sort
        //Selection sort algo sorts an core.array by reapeatedly finding the min element and from the unsorted part and putting
        //putting at the begining. The algorithm maintans two sub arrays in a given core.array
        for (int i = 0; i < 3; i++) {
            int max = i;
            //Find Min Element in the unsorted core.array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max])
                    max = j;
            }
            //Swap the found element with the first element
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;

        }
        for (int i = 0; i < 3; i++)
            System.out.println(arr[i]);
    }

}
