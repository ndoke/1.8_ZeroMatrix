package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ZeroMatrixTest {
    ZeroMatrix zeroMatrix = new ZeroMatrix();
    private int input1[][] = {new int[]{0, 2, 3, 4}, new int[]{5, 6, 0, 8}, new int[]{9, 10, 11, 12}, new int[]{13, 14, 15, 16}};
    private int input2[][] = {new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 0}, new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}};
    private int output1[][] = {new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 10, 0, 12}, new int[]{0, 14, 0, 16}};
    private int output2[][] = {new int[]{1, 2, 3, 0}, new int[]{0, 0, 0, 0}, new int[]{1, 2, 3, 0}, new int[]{5, 6, 7, 0}};

    @Test
    public void test() {
        zeroMatrix.convertRowsColumnsToZero(input1);
        for (int i = 0; i < input1.length; i++) {
            Assert.assertEquals(input1[i], output1[i]);
        }
        zeroMatrix.convertRowsColumnsToZero(input2);
        for (int i = 0; i < input2.length; i++) {
            Assert.assertEquals(input2[i], output2[i]);
        }
    }
}
