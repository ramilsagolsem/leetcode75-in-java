package com.code.challenge.leetcode75.level1.string;

import org.junit.Assert;
import org.junit.Test;

public class TestIsomorphicStrings {

    @Test
    public void testIsIsomorphic1(){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        boolean result = isomorphicStrings.isIsomorphic("egg","add");
        System.out.println(result);
        Assert.assertEquals(true,result);
    }

    @Test
    public void testIsIsomorphic2(){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        boolean result = isomorphicStrings.isIsomorphic("foo","bar");
        System.out.println(result);
        Assert.assertEquals(false,result);
    }

    @Test
    public void testIsIsomorphic3(){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        boolean result = isomorphicStrings.isIsomorphic("paper","title");
        System.out.println(result);
        Assert.assertEquals(true,result);
    }

    @Test
    public void testIsIsomorphic4(){
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        boolean result = isomorphicStrings.isIsomorphic("badc","baba");
        System.out.println(result);
        Assert.assertEquals(false,result);
    }
}
