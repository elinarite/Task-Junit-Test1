package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        MethodTask1 methodTask1 = new MethodTask1();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        methodTask1.transpose(matrix);
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        methodTask1.rotate(b);
        int[][] c = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(methodTask1.sumUD(c));

    }
}

class MethodTask1 {

    //       /**
    //         * [ 1  2  3  4]
    //         * [ 5  6  7  8]
    //         * [ 9 10 11 12]
    //         * [13 14 15 16]
    //         * ---------
    //         * sum D
    //         * sum U
    //         */
    public List<Integer> sumUD(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    sumA = sumA + matrix[i][j];
                } else if (i > j) {
                    sumB = sumB + matrix[i][j];
                }
            }
        }
        list.add(sumA);
        list.add(sumB);

        return list;
    }

    /**
     * [1 2 3]
     * [4 5 6]
     * -------
     * [1 4]
     * [2 5]
     * [3 6]
     */
    public int[][] transpose(int[][] matrix) {

        int matrix2[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + "");
            }
            System.out.println();
        }
        return matrix2;
    }
//    //     * [1 2 3]
////     * [4 5 6]
////     * [7 8 9]
////     * --------
////     * [1 4 7]
////     * [2 5 8]
////     * [3 6 9]

    public int[][] rotate(int[][] matrix) {
        if (matrix[0].length != matrix.length) {
            throw new IncorrectIndexException(ErrorMessageTask1.INCORRECT_INDEX_EXCEPTION);
        }
        int[][] matrix2 = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + "");
            }
            System.out.println();
        }
        return matrix2;
    }
}