package dp;
/*
 * 91. Decode Ways  QuestionEditorial Solution  My Submissions
Total Accepted: 79337
Total Submissions: 439338
Difficulty: Medium
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 */
public class DecodeWays91 {
public int numDecodings(String s) {
	//�������Ҫ��ȫ
        int length=s.length();
        if(length<1)   //�ַ���Ϊ�� ����0
        	return 0;
        int dp[]=new int[length+1];
        dp[0]=1;
        int start=Character.digit(s.charAt(0),10);//��һ���ַ�Ϊ0 �޷�����  ����0
        if(start==0)
        	return 0;
        dp[1]=1;
        for(int i=2;i<=length;i++){
        	int front=Character.digit(s.charAt(i-2),10);
        	int now=Character.digit(s.charAt(i-1),10);
        	if(now==0) {   //�����ǰֵΪ0 �����ǰ���ƥ����һ��
        		if(front==1||front==2)
        		dp[i]=dp[i-2];
        		else
        			return 0;//��ǰΪ0 ǰ�治Ϊ1 ��2 �޷����� ����0
        	}//��ǰֵ��Ϊ0
        	else if(front==1||(front==2&&now<7))//ֻ�е�ǰһ���ַ�Ϊ1����Ϊ2����ǰ�ַ�С��7 ��ǰһ���ַ��������һ������
        		dp[i]=dp[i-1]+dp[i-2];
        	else
        		dp[i]=dp[i-1];
        }
        return dp[length];
        
    }
}
