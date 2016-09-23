package leetcode0429;
/*
 * 9. Palindrome Number
 * Determine whether an integer is a palindrome. Do this without extra space.
 * Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
 */
public class PlindromeNumber {
public static void main(String args[]){
	String s =  String.valueOf(15);
	StringBuilder sb = new StringBuilder(s);
	System.out.println(s.equals(sb));
	System.out.println(sb.equals(s));
	System.out.println(s);
	System.out.println(sb.reverse());
	System.out.println(sb);
	String ss=sb.toString();
	System.out.println(sb.length());
	System.out.println(s.equals(ss));
}
	 public boolean isPalindrome(int x) {
	        String s =  String.valueOf(x);
	        StringBuilder sb = new StringBuilder(s);
	        if(s.equals(sb.reverse().toString())){
	        	return true;
	        }else{
	        	return false;
	        }
	    }
	 /*
	  * if (x < 0)
 7             return false;
 8         if (x == 0)
 9             return true;
10             
11         int base = 1;
12         while(x / base >= 10)
13             base *= 10;
14             
15         while(x)
16         {
17             int leftDigit = x / base;
18             int rightDigit = x % 10;
19             if (leftDigit != rightDigit)
20                 return false;
21             
22             x -= base * leftDigit;
23             base /= 100;
24             x /= 10;
25         }
26         
27         return true;
	  */
}
