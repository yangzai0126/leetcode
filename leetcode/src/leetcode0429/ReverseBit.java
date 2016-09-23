package leetcode0429;
/*
 * Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:

 */
public class ReverseBit {

	 public int reverseBits(int y) {
         
	        // INT_SIZE=32 in general  
	        int INT_SIZE = Integer.SIZE;  
	  
	        for (int i = 0; i < INT_SIZE / 2; i++) {  
	            int j = INT_SIZE - 1 - i;  
	  
	            int low = (y >> i) & 1;  
	            int high = (y >> j) & 1;  
	  
	            int A = 1 << i;  
	            int B = 1 << j;  
	  
	            if ((high ^ low) == 1) {  
	                y = y ^ (A | B);  
	            }  
	        }  
	        return y;  
	    }

}
