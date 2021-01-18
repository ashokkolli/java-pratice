package practicearrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {


    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> list = fourSum(arr);
        for (List<Integer> item : list)
            System.out.println(item);
    }

    public static List<List<Integer>> fourSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums == null || nums.length < 4)
            return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] > nums[j - 1]) {
                        int k = j + 1;
                        int l = nums.length - 1;
                        while (k < l) {
                            if (nums[i] + nums[j] + nums[k] + nums[l] == 0) {
                                List<Integer> list = new ArrayList<Integer>();
                                list.add(nums[i]);
                                list.add(nums[j]);
                                list.add(nums[k]);
                                list.add(nums[l]);
                                result.add(list);
                                k++;
                                l--;

                                //handle duplicate here
                                while (k < l && nums[k] == nums[k - 1])
                                    k++;
                                while (k < l && nums[l] == nums[l + 1])
                                    k--;

                            } else if (nums[i] + nums[j] + nums[k] + nums[l] < 0) {
                                k++;
                            } else {
                                l--;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

}
