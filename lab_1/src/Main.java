import java.util.Arrays;

// --- [Варіант 15] ---  

// -- C5 = 3
//C = A XOR B, 

// C7 = 2
// short

// C11 = 1
// Обчислити суму найменших елементів кожного стовпця матриці


public class Main {
    public static void main(String[] args) {
        try {
            short[][] matrix1 = {
                    {1, 40, 2},
                    {16, 12, 6},
                    {7, 5, 9}
            };

            short[][] matrix2 = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}
            };

            if (!isSameSize(matrix1, matrix2)) {
                throw new IllegalArgumentException("Матриці мають різні розміри.");
            }

            short[][] resultMatrix = xorMatrices(matrix1, matrix2);

            System.out.println("Результат XOR матриць:");
            printMatrix(resultMatrix);

            int sumOfMinElements = sumOfMinColumnElements(resultMatrix);

            System.out.println("Сума найменших елементів кожного стовпця: " + sumOfMinElements);

        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Невідома помилка: " + e.getMessage());
        }
    }

    private static boolean isSameSize(short[][] matrix1, short[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
        }

        return true;
    }

    private static short[][] xorMatrices(short[][] matrix1, short[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        short[][] result = new short[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = (short) (matrix1[i][j] ^ matrix2[i][j]);
            }
        }

        return result;
    }

    private static int sumOfMinColumnElements(short[][] matrix) {
        int cols = matrix[0].length;
        int sum = 0;

        for (int j = 0; j < cols; j++) {
            short minElement = Short.MAX_VALUE;
            for (short[] shorts : matrix) {
                if (shorts[j] < minElement) {
                    minElement = shorts[j];
                }
            }
            sum += minElement;
        }

        return sum;
    }

    private static void printMatrix(short[][] matrix) {
        for (short[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}