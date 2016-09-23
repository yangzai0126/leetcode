package leetcode;


import java.util.*;

/*
 * Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
ÔªÒô×ÖÄ¸ÓÐ  aeiou;
 */
public class Vowels {

	 public String reverseVowels(String s) {
	        int length=s.length();
	        char rs[] =s.toCharArray();
	        char vs[]=new char[length];
	        int count=0;
	        List<Character> cl=new ArrayList<Character>();
	        cl.add('a');
	        cl.add('e');
	        cl.add('i');
	        cl.add('o');
	        cl.add('u');
	        cl.add('A');
	        cl.add('E');
	        cl.add('I');
	        cl.add('O');
	        cl.add('U');
	      for(int i=0;i<length;i++){
	    	  if(cl.contains(rs[i])){
	    		  vs[count++]=rs[i];
	    	  }
	      }
	      for(int i=0;i<length;i++){
	    	  if(cl.contains(rs[i])){
	    		  rs[i]=vs[--count];
	    	  }
	      }
	      String rss=String.valueOf(rs);
		 return rss;
	    }
}
