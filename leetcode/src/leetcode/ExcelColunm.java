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
    
    ���� �Ĺؼ��ǽ���ת�� ��һ������ת����26�����������������ǵ�λ����С��ǰһλ��������
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