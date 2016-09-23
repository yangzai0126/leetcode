package leetcode;
/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
 */
 public class PowerFour {
	
/*	public static void main(String args[]){
		isPowerOfFour(80);
	}
*/
public static boolean isPowerOfFour(int num) {
	if(num==0){
		return false;
	}
	if(num==1){
		return true;
	}
        int n=0xaaaaaaab;
        int result=n & num;
       if(result!=0){
    	 return false;  
       }else{
    	   int count=0;
    	   String s= Integer.toHexString(num);//s的16进制表示只能是1位为1
    	   for(int i=0;i<s.length();i++){
    		   if(s.charAt(i)!='0'){
    			   if(s.charAt(i)=='5'){//等于5说明有两位都是1
    				   count =count+2;
    			   }else{
    			   count++;
    			   }
    		   }
    		    if(count > 1){
    		   return false;
    	   }
    	   }
    	     return true;
       }
     
    }
public boolean isPowerofFour(int num){
	if(num<=0){
		return false;
	}
	int num1=num;
	num=(int)Math.sqrt(num);
	if(num*num==num1){
	if((num&(num-1))==0){
		return true;
	}else{
		return false;
	}
	}else{
		return false;
	}
}
}
