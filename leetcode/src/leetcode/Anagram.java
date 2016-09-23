package leetcode;
import java.util.*;
/*
 * Given two strings s and t, write afunction t determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

判断两个字符串是不是只是无序的 先  对里面字符串中的字符排序 再比较两个字符串是否相等
 */
public class Anagram {
    public boolean isAnagram(String s, String t) {
    	char sc[]=s.toCharArray();
    	char tc[]=t.toCharArray();
      Arrays.sort(sc);
      Arrays.sort(tc);
      if(String.valueOf(sc).equals(String.valueOf(tc))){
    	  return true;
      }else{
    	  return false;
      }
      
    }
}
