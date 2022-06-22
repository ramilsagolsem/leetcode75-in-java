package com.code.challenge.leetcode75.level1.string;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {

    /**
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t)) return true;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int j=0;
        StringBuilder bud = new StringBuilder();
        for(char c: sChar){
            while(j<tChar.length){
                j++;
                if(tChar[j-1]==c) {
                    bud.append(tChar[j-1]);
                    break;
                }
            }
        }
        return bud.toString().equals(s);
    }
}
