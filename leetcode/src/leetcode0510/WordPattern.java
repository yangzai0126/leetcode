package leetcode0510;
import java.util.*;
public class WordPattern {
public boolean wordPattern(String pattern, String str) {
	    int length = pattern.length();
	    String ss[] = str.split(" ");
	   Set<Integer> lm = new HashSet<Integer>();
	   for(int i=0 ;i<length;i++){
		   char c =pattern.charAt(i);
		   pattern.indexOf(c, i+1);
	   }
        return false;
    }
}
