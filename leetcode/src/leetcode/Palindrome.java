package leetcode;

import java.util.*;

public class Palindrome {

	public static void main(String args[]){
		System.out.println(isPalindrome(""));
	}
	 public List<List<Integer>> palindromePairs(String[] words) {
	        int length=words.length;
	        List<List<Integer>> ll=new  ArrayList<List<Integer>>();
	        for(int i=0;i<length;i++)
	        	for(int j=0;i!=j&&j<length;j++){
	        		
	        		if(isPalindrome(words[i]+words[j])){
	        			List<Integer> li= new ArrayList<Integer>();
	        			li.add(i);
	        			li.add(j);
	        			ll.add(li);
	        		}
	        	}
	        return ll;
	    }
	public static boolean isPalindrome(String s){
		int length=s.length();
		//System.out.println(length);//空字符串也是回文
		int i=0;
		int j=length-1;
		while(i<j){
			if(s.charAt(i)==s.charAt(j)){
				i++;
				j--;
			}else{
				return false;
			}
		}
		return true;
	}
}
