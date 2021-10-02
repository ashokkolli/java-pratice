package core.apple.arrays.leetcode.easy;

public class NumberToArray {
    public static void main(String[] args) {
        lenOfNumber(1234);
    }
  /*  public int[] numberToArray(Integer num){

    }*/
    public static int lenOfNumber(Integer  num){
        Integer count =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
        return count;
    }

}
