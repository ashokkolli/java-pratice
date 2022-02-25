package core.tiktok.binarysearch;

public class _1060_MissingElementinSortedArray {
    public int missingElement(int[] nums, int k) {
        // 4, 10, 8 k = 5
        for(int i = 1; i < nums.length; i++){
            int missingNumerCount = nums[i] - nums[i -1] - 1 ;// Missing numbers count
            if(k<=missingNumerCount){
                return nums[i - 1] + k;
            }
            k = k - missingNumerCount;
        }
        return nums[nums.length-1] + k;

    }
}
