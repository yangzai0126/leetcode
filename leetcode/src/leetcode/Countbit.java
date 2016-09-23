package leetcode;
/*
 * Given a non negative integer number num. For every numbers i in the range 0 ¡Ü i ¡Ü num calculate the number of 1's in their binary representation and return them as an array.

Example:
For num = 5 you should return [0,1,1,2,1,2].
 */
public class Countbit {

	 public int[] countBits(int num) {
	        int dp[]=new int[num+1];
	        dp[0]=0;
	        for(int i=0;i<=num;i++){
	        	if(i%2==1){
	        		dp[i]=dp[i/2]+1;
	        	}else{
	        		dp[i]=dp[i/2];
	        	}
	        }
	        return dp;
	    }
}
