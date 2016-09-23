package leetcode0504;
/*
 * Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.

Subscribe to see which companies asked this question
 */
public class PlusOne {

public int[] plusOne(int[] digits) {
	   int length1=digits.length;
       int length=length1-1;
       if(digits[length]!=9){
    	   digits[length]++;
    	   return digits;
       }
	while(length>=0&&digits[length]==9){//注意 这时候要先判断length>=0，再判断是否等于9 要不可能出现数组溢出
		digits[length]=0;
		length--;
	}
        	if(length<0){
        		int [] newd=new int[length1+1];
        		newd[0]=1;
        		return newd;
        	}else{
        		digits[length]++;
        		return digits;
        	}
        
    }
}
