package core.imp.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
*
* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []

*
* */


//https://leetcode.com/problems/3sum/
//https://www.youtube.com/watch?v=jzZsG8n2R9A&t=39s
public class _3SUM {

    //_3sum(new int[]{-2, -2, 0, 0, 2, 2});
    public static List<List<Integer>> _3sum(int[] num){
        //sort uses quicksort //O(nlogn)
        Arrays.sort(num);
        for(int n : num){
            System.out.println(n);
        }
        System.out.println("");
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < num.length; i++ ){
            if( i == 0 || num[i - 1] != num[i]){ // This is to remove the duplicates in the 3 SUM
                _2sum(num, i, list);
            }

        }
        System.out.println(list);
        return list;
    }

    public static void _2sum(int[] num, int i , List<List<Integer>> list) {
        int l = i+1;
        int r = num.length - 1;
        while(l < r){
            int sum = num[i] +num[l] + num[r];
            if(sum < 0)
                l++;
            else if(sum > 0)
                r--;
            else{
                list.add(Arrays.asList(num[i], num[l], num[r]));
                l++;
                r--;
               while(num[l] == num[l-1] && l < r) // this is remove the duplicates in the 2_SUM
                    l++;
            }
        }
    }

    public static void main(String[] args) {
        _3sum_II(new int[]{-2, -2, 0, 0, 2, 2}, 4);
    }

    public static List<List<Integer>> _3sum_II(int[] num, int target){
        //sort uses quicksort //O(nlogn)
        Arrays.sort(num);
        for(int n : num){
            System.out.println(n);
        }
        System.out.println("");
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < num.length; i++ ){
            if( i == 0 || num[i - 1] != num[i]){ // num[i - 1] != num[i]  to ignore when it's the same value, when you consider it for 2 value
                _2sum_II(num, i, list, target);
            }
        }
        System.out.println(list);
        return list;

    }


    public static void _2sum_II(int[] num, int i , List<List<Integer>> list, int target) {
        int l = i+1;
        int r = num.length - 1;

        while(l < r){
            int sum = num[i] +num[l] + num[r];
            if(sum < target)
                l++;
            else if(sum > target)
                r--;
            else{
                list.add(Arrays.asList(num[i], num[l], num[r]));
                l++;
                r--;
                while(num[l] == num[l-1] && l < r)
                    l++;
            }
        }


    }

}
