package leetcode;
import java.util.*;
/*
 * Given two strings s and t, write afunction t determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

�ж������ַ����ǲ���ֻ������� ��  �������ַ����е��ַ����� �ٱȽ������ַ����Ƿ����
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
