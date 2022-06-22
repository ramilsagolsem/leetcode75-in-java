package com.code.challenge.leetcode75.level1.prefix_sum;


import org.junit.Assert;
import org.junit.Test;

public class TestRunningSumOf1DArray {

    @Test
    public void testRunningSum1(){
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        int[] sum = runningSumOf1DArray.runningSum(new int []{1,2,3,4});
        Assert.assertArrayEquals(sum,new int[]{1,3,6,10});
    }

    @Test
    public void testRunningSum2(){
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        int[] sum = runningSumOf1DArray.runningSum(new int []{1,1,1,1,1});
        Assert.assertArrayEquals(sum,new int[]{1,2,3,4,5});
    }

    @Test
    public void testRunningSum3(){
        RunningSumOf1DArray runningSumOf1DArray = new RunningSumOf1DArray();
        int[] sum = runningSumOf1DArray.runningSum(new int []{3,1,2,10,1});
        Assert.assertArrayEquals(sum,new int[]{3,4,6,16,17});
    }
}
