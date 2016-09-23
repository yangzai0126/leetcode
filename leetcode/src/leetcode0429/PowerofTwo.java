package leetcode0429;

public class PowerofTwo {

	  public boolean isPowerOfTwo(int n) {
		  if(n<=0){
			  return false;
		  }
	        if((n & (n-1))==0){
	        	return true;
	        }else{
	        	return false;
	        }
	    }
}
