package core.tiktok.arrays;

public class _31_NextPermutation {

    public static void main(String[] args) {
        nextPermutation(new int[]{1, 2, 3, 4, 3, 2, 1});
    }

    public static void nextPermutation(int[] nums) {
        // 1234321
        // find the decreasing element from the right  i.e 3 (index = 2)
        // find the larger number than index 2 on the right set
        // Swap the numbers
        // reverse the entire right set from i+1 to r;

        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
                i--;
        }
        if(i >= 0){
            int j = nums.length - 1;
            while(nums[j]<= nums[i]){
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i +1);
        for(int n : nums){
            System.out.print(n);
        }
    }

    private static void reverse(int[] nums, int i) {
        int j = nums.length -1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
