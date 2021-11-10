package core.imp.generic;

public class MyPower {
    public static void main(String[] args){
        System.out.println(myPow(9,3));
    }
    public static long  myPow(int x, int n){
        if(n == 0)
            return  1;
        else if( n%2 == 0){
            long y = myPow(x, n/2);
            return y*y;
        }else{
            return x*myPow(x, n-1);
        }
  }

}
