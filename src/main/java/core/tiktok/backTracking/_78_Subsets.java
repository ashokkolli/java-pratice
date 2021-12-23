package core.tiktok.backTracking;

import java.util.ArrayList;
import java.util.List;

public class _78_Subsets {

   public List<List<Integer>> subsets(int[] nums){
       List<List<Integer>> list = new ArrayList<>();
       backTrack(list, new ArrayList<>(), nums, 0);
       return list;
   }

   public void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start ){
       list.add(new ArrayList<>(tempList));
       for(int i  = start; i < nums.length; i++){
           //Select or choose
           tempList.add(nums[i]);
           //Explore
           backTrack(list, tempList, nums, i+1);
           //Deselect
           tempList.remove(tempList.size() - 1);
       }

   }

}
