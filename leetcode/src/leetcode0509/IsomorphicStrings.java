package leetcode0509;
import java.util.*;
/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
哈希表
"aba"
"baa"
Output:
true
Expected:
false
题目没有理解透啊

 */
public class IsomorphicStrings {

public boolean isIsomorphic(String s, String t) {
        int length = s.length();
       int si[] = new int[128];
       int ti[] = new int[128];
       for(int i=0;i<length;i++){
    	  char sc=s.charAt(i);
    	  char tc = t.charAt(i);
    		  si[sc]++;
    		  ti[tc]++;
       }
      Arrays.sort(si);
       Arrays.sort(ti);
        return Arrays.equals(si,ti );
    }
}
