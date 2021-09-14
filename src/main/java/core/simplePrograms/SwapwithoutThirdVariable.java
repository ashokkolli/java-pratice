//https://www.youtube.com/watch?v=Msr4Z8m6Q_c&list=PLeIMaH7i8JDjw0uHGG1AwB8M2DwDS4-Nk
package core.simplePrograms;

public class SwapwithoutThirdVariable {

    public static void main(String[] args) {
        int x = 10, y = 20;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.print(x + " " + y);

    }

}
