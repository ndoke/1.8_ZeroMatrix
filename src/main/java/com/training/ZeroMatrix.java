package com.training;

/**
 * {@link ZeroMatrix} has a method to convert a row or column with a zero
 * to all zeros.
 * {@link ZeroMatrix#convertRowsColumnsToZero(int[][])} (String)} returns
 * a zero matrix version of the given matrix.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class ZeroMatrix {
    /**
     * Returns a zero matrix version of the given matrix
     *
     * @param matrix matrix to be converted
     * @return a zero matrix version of the given matrix
     */
    public int[][] convertRowsColumnsToZero(int matrix[][]) {
        // find if first row has any zeros, if yes, update the flag
        boolean firstRowHasZero = false;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }

        // find if first column has any zeros, if yes, update the flag
        boolean firstColumnHasZero = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstColumnHasZero = true;
                break;
            }
        }

        // check if any column has zeros, if yes, store 0 in corresponding column and first row
        // check if any row has zeros, if yes, store 0 in corresponding row and first column
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // convert the corresponding columns to all zeros
        for (int i = 1; i < matrix[0].length; i++) {
            if (matrix[i][0] == 0) {
                convertRowToZero(matrix, i);
            }
        }

        // convert the corresponding rows to all zeros
        for (int j = 1; j < matrix.length; j++) {
            if (matrix[0][j] == 0) {
                convertColumnToZero(matrix, j);
            }
        }

        // if first row or colum has zeros, convert them to 0
        if (firstColumnHasZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if (firstRowHasZero) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        return matrix;
    }

    private void convertColumnToZero(int matrix[][], int j) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][j] = 0;
        }
    }

    private void convertRowToZero(int matrix[][], int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }
    }
}
