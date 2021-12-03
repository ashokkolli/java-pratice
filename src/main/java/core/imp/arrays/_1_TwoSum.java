package core.imp.arrays;


import java.util.HashMap;
import java.util.Map;

/*
*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*
*Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
*
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

*
*
* */
public class _1_TwoSum {

    public static int[] _2SUM(int[] arr, int target){
        int[] ind = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < arr.length; i++){
            if(map.containsKey(target-arr[i])){
                ind[0] = map.get(target-arr[i]);
                ind[1] = i;
                System.out.println(ind[0]);
                System.out.println(ind[1]);

                return ind;
            }else
                map.put(arr[i], i);
        }

        return ind;
    }

    public static int[] _2SUM_bf(int[] arr, int target){

        int[] ind = new int[2];
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    ind[0] = arr[i];
                    ind[1] = arr[j];
                    System.out.println(ind[0]+ind[1]);
                    return ind;
                }
            }
        }
        return ind;
    }
    public static void main(String[] args) {

        _2SUM(new int[]{3, 3}, 6);
    }

}
