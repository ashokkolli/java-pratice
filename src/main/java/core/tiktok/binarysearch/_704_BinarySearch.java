package core.tiktok.binarysearch;

public class _704_BinarySearch {
    public static void main(String[] args) {

        int op = binarySearch(new int[]{-1,0,3,5,9,12}, 9);
        System.out.println(op);
    }

    public static int binarySearch(int[] nums, int target){
        //Find Pivot
        // if pivot is target return i
        //if target is less than pivot; r = pivot-1
        //else l = pivot +1 ;
        int l = 0;
        int r = nums.length - 1;
        int pivot = 0;
        while(l <= r){
            pivot = l + (r-l)/2;
            if(nums[pivot] == target)
                return pivot;
            else if(target <= nums[pivot])
                r = pivot - 1;
            else
                l = pivot + 1;
        }

        return -1;
    }
}
