package com.code.challenge.leetcode75.level1.string;

import org.junit.Assert;
import org.junit.Test;

public class TestIsSubsequence {

    @Test
    public void testIsSubsequence1(){
        IsSubsequence isSubsequence = new IsSubsequence();
        boolean result = isSubsequence.isSubsequence("abc", "ahbgdc");
        System.out.println(result);
        Assert.assertEquals(true,result);
    }

    @Test
    public void testIsSubsequence2(){
        IsSubsequence isSubsequence = new IsSubsequence();
        boolean result = isSubsequence.isSubsequence("axc", "ahbgdc");
        System.out.println(result);
        Assert.assertEquals(false,result);
    }
}
