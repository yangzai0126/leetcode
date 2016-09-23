package leetcode0429;
/*
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 一定要理解 n&(n-1)逐渐减少1的个数
 
 对于java都是有符号数 所以 负数做除法运算不行 计算方式是 把最高位1换成0 再按照正数的进行运算
 */
public class NumberofOneBit {

	public static void main(String args[]){
		int n=0xFFFFFFFF;
		
		System.out.println(hammingWeight(n));
		System.out.println(usewhile(n));
		
		
	}
 public static int hammingWeight(int n) {
        if(n==0){
        	return 0;
        }
        int count=1;
       while((n&(n-1))!=0){
        	count++;
        	n=(n&(n-1));
        }
       return count;
    }
 
 public static int usewhile(int n){
	 if(n==0){
		 return 0;
	 }
	 int count=1;
	 while(n/2!=0){
		 if(n%2==0){
			 count++;
		 }
		 n=n/2;
	 }
	 return count;
 }
}
