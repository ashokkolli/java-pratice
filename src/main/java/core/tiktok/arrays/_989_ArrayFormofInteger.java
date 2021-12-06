package core.tiktok.arrays;

public class _989_ArrayFormofInteger {
    public static void main(String[] args) {
        numberToArray(1234567890);
    }
  public static int[] numberToArray(Integer num){
      int len = lenOfNumber(num);
      int[] arr = new int[len];
      while (num!=0){
          arr[--len] = num%10;
          num = num/10;
      }
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
      }
      return arr;

    }
    public static int lenOfNumber(Integer  num){
        Integer count =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }

}
