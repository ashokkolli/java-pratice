package core.tiktok.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _41_FirstMissingPositive {
    public static void main(String[] args) {

    }
    //NeetCode
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums)
            set.add(n);
        int i;
        for( i = 1 ; i <=nums.length + 1 ; i++){
            if(!set.contains(i))
                break;
        }
        return i;
    }
}
