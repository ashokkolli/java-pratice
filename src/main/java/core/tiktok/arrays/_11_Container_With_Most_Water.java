package core.tiktok.arrays;

public class _11_Container_With_Most_Water {

//https://leetcode.com/problems/container-with-most-water/

    //https://www.youtube.com/watch?v=UuiTKBwPgAo&t=330s
    public static void main(String[] args) {

        mostWater(new int[]{1,8,6,2,5,4,8,3,7});

    }
    public static int mostWater(int[] height){
        int area ;
        int res =0;
        int l =  0;
        int r = height.length -1;
        while(l < r){
            area = (r - l) * Math.min(height[l], height[r]); //
            res = Math.max(area, res);
            if(height[l] < height[r]){
                l++;
            }else                    // if (height[l] > height[r]) or both are equal
                r--;
                         // if both heights are equal, please reduce right --;
        }
        System.out.println(res);
        return res;
    }
}
