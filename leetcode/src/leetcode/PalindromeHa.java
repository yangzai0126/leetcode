package leetcode;

import java.util.*;


public class PalindromeHa {

	 public List<List<Integer>> palindromePairs(String[] words) {
	        int length=words.length;
	        List<List<Integer>> ll=new  ArrayList<List<Integer>>();
	        HashMap<String,Integer> hm1=new HashMap<String,Integer>();
	        for(int i=0;i<length;i++){
	        	hm1.put(words[i], i);
	        }
	        for(int i=0;i<length;i++){
	        	String rs=reverseString(words[i]);
	        	if(hm1.containsKey(rs)){
	        		int j=hm1.get(rs);
	        		if(i!=j){//i=j说明 本身是回文;
	        		List<Integer> li= new ArrayList<Integer>();
        			li.add(i);
        			li.add(j);
        			ll.add(li);
	        		}else{
	        			if(words[i]!=""){
	        			if(hm1.containsKey("")){
	        				int kong=hm1.get("");
	        				if(i!=kong){
	        				List<Integer> li= new ArrayList<Integer>();
	            			li.add(i);
	            			li.add(kong);
	            			ll.add(li);
	            			List<Integer> li1= new ArrayList<Integer>();
	            			li1.add(kong);
	            			li1.add(i);
	            			ll.add(li1);
	        			}
	        			}
	        		}
	        		}
        			
	        	}
	        	for(int j=1;j<words[i].length();j++){
	        		if(isPalindrome(words[i].substring(0, j))&&hm1.containsKey(reverseString(words[i].substring(j)))){
	        			int m=hm1.get(reverseString(words[i].substring(j)));
	        			List<Integer> li= new ArrayList<Integer>();
	        			li.add(m);
	        			li.add(i);
	        			ll.add(li);
	        		}
	        		if(isPalindrome(words[i].substring(j))&&hm1.containsKey(reverseString(words[i].substring(0,j)))){
	        			int m=hm1.get(reverseString(words[i].substring(0,j)));
	        			List<Integer> li= new ArrayList<Integer>();
	        			li.add(i);
	        			li.add(m);
	        			ll.add(li);
	        		}
	        		
	        	}
	        }
	        
	        	
	        return ll;
	    }
	 public String reverseString(String s) {
		 //还可以通过StringBuilder
		// StringBuilder sb =new StringBuilder(s);
		// return new String( sb.reverse());
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
	 public  boolean isPalindrome(String s){
			int length=s.length();
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
