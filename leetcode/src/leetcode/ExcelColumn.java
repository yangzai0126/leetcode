package leetcode;
/*
 * Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
public class ExcelColumn {

public int titleToNumber(String s) {
        char cs[]= s.toCharArray();
        int length=cs.length;
        int re=0;
        for(int i=length-1;i>=0;i--){//注意cs[0]是最低位就可以
        	re=re+((int)cs[i]-64)*(int)Math.pow(26, length-1-i);
        }
        return re;
    }
}
