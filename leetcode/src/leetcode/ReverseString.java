package leetcode;
/*
 * Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */
public class ReverseString {

	 public String reverseString(String s) {
	        int length=s.length();
	        char cs[]=s.toCharArray();
	        char c;
	        for(int i=0;i<length/2; i++){
	        	c=cs[i];
	        	cs[i] = cs[length-i-1];
	        	cs[length-i-1]=c;
	        }
	        String rs=String.valueOf(cs);
	        return rs;
	    }
}
