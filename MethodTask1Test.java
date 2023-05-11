package Matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodTask1Test {
    MethodTask1 methodTask1 = new MethodTask1();

    @Test
    void transpose() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        int[][] result = methodTask1.transpose(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    void rotate() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] result = methodTask1.transpose(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    void rotateException() {
        int[][] matrix = {{2, 3}, {4, 5, 6}, {7, 8, 9}};
       Exception exception =  assertThrows(IncorrectIndexException.class, () -> methodTask1.rotate(matrix));
       String message = "INCORRECT_INDEX_EXCEPTION";
       assertEquals(message, exception.getMessage());
    }

    @Test
    void sumUD() {
        int[][] matrix = {{1, 2}, {3, 4}};
        List<Integer> expected = new ArrayList<>(List.of(2, 3));
        List<Integer> result = methodTask1.sumUD(matrix);
        assertEquals(expected, result);
    }
}