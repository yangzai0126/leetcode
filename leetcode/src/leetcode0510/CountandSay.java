package leetcode0510;

public class CountandSay {
	 public String countAndSay(int n) {
	        StringBuilder sbold = new StringBuilder("1");
	        StringBuilder sbnew = new StringBuilder("11");
	        if(n==0)
	        	return null;
	        if(n==1)
	        	return sbold.toString();
	        if(n==2)
	        	return sbnew.toString();
	        int old=2;
	        while(old<n){
	        	sbnew.delete(0, sbnew.length());
	        	for(int i=0;i<sbold.length();i++){
	        		char c=sbold.charAt(i);
	        	}
	        }
	        return null;
	    }
}
