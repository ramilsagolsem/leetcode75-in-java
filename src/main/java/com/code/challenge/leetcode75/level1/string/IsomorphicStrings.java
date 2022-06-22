package com.code.challenge.leetcode75.level1.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings {

    /**
     * Solves the problem by mapping each character of s to corresponding character of t and vice versa using two hashmaps.
     * If any of the key is already mapped to a different value then it returns false
     * Example : s= add ; t= egg
     * a -> e
     * d -> g
     * Vice versa
     * e -> a
     * g -> d
     *
     * Time Complexity : O(n)
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character,Character> s2tMap = new HashMap<>();
        Map<Character,Character> t2sMap = new HashMap<>();
        if(sChars.length == tChars.length){
            for (int i=0; i<sChars.length; i++){
                if((s2tMap.containsKey(sChars[i]) && s2tMap.get(sChars[i]) != tChars[i] )
                        || (t2sMap.containsKey(tChars[i]) && t2sMap.get(tChars[i]) != sChars[i] )){
                    return false;
                }
                s2tMap.put(sChars[i],tChars[i]);
                t2sMap.put(tChars[i],sChars[i]);
            }
            return true;
        }
        return false;
    }
}
