package core.tiktok.heap;

import java.util.Arrays;
import java.util.LinkedList;

public class MatrixTest {
    public static void main(String[] args) {
        //int[][] intArr = new int[1][2];
         int[][] matrix = {{10,30},{5, 10},{15, 40}};
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<Integer> merged = new LinkedList<>();
        merged.add(10);
        System.out.println("  ");
        System.out.println(merged);
        System.out.println(merged.getLast());
        System.out.println("  ");

        merged.add(20);
        System.out.println("  ");
        System.out.println(merged);
        System.out.println(merged.getLast());
        System.out.println("  ");
        merged.add(30);
        System.out.println(merged);
        System.out.println(merged.getLast());

       /* for(int i = 0; i < matrix.length; i++){
            for(int j =0 ; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println("After Sorting");

         Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < matrix.length; i++){
            for(int j =0 ; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }*/



    }

}
