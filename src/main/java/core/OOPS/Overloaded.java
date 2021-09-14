package core.OOPS;

public class Overloaded {

    public static void main(String[] args) {

    }

    public int overload(int i) {  // 1
        return i;
    }

    public float overload(float j) {// 2
        return j;
    }

    public float overload(double k) {//3
        return 0.00f;
    }

    public float overload(double k, int l) {//4
        return 0.00f;
    }

    public int overload(int i, int j) {  // 5
        return i;
    }

    //1,2, and 3 methods are overloaded as all 3 methods have same name
    //1 and 2 have diffent method signature


}
