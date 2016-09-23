package leetcode;
/*
 * Given a positive integer n, break it into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can get.

For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 36 (10 = 3 + 3 + 4).

Note: you may assume that n is not less than 2.
 */
public class IntegerBreak {

public int integerBreak(int n) {
        int shang=n/3;
        int yu=n%3;
        int product=1;
        if(n==2){
        	return 1;
        }
        if(n==3){
        	return 2;
        }
        for(int i=0;i<shang; i++){
        	product=product*3;
        }
        if(yu==0){
        	return product;
        }else if(yu==1){
        	return product/3*4;
        }else{
        	return product*2;
        }
       
    }
}
