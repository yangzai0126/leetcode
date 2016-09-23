package leetcode;
/*
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
    
    本题 的关键是进制转换 ，一个整数转换成26进制数，但是问题是低位的最小和前一位的最大相等
 */
public class ExcelColunm{
	
 public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();
        int mod=0;
        while(n>0){
        	mod=(n-1)%26;
        	sb.append((char)(mod+65));
        	n=(n-1)/26;
        }
        return sb.reverse().toString();
    }
}