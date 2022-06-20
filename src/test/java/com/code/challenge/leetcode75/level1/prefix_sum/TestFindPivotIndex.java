package com.code.challenge.leetcode75.level1.prefix_sum;

import com.code.challenge.leetcode75.level1.prefix_sum.FindPivotIndex;
import org.junit.Assert;
import org.junit.Test;

public class TestFindPivotIndex {

    @Test
    public void testPivotIndex1(){
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int index = findPivotIndex.pivotIndex(new int[]{1,7,3,6,5,6});
        System.out.println(index);
        Assert.assertEquals(3,index);
    }

    @Test
    public void testPivotIndex2(){
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int index = findPivotIndex.pivotIndex(new int[]{1,2,3});
        System.out.println(index);
        Assert.assertEquals(-1,index);
    }

    @Test
    public void testPivotIndex3(){
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int index = findPivotIndex.pivotIndex(new int[]{2,1,-1});
        System.out.println(index);
        Assert.assertEquals(0,index);
    }
}
